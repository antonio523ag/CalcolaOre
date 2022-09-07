package dev.antoniogrillo.calcolaore.ui.aggiungi_corso;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import dev.antoniogrillo.calcolaore.databinding.FragmentAggiungiCorsoBinding;

public class AggiungiCorsoFragment extends Fragment {

    private FragmentAggiungiCorsoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*AggiungiCorsoViewModel aggiungiCorsoViewModel =
                new ViewModelProvider(this).get(AggiungiCorsoViewModel.class);*/

        binding = FragmentAggiungiCorsoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

/*        final TextView textView = binding.textGallery;
        aggiungiCorsoViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        */
        binding.aggiungi.setOnClickListener(this::getTitolo);
        return root;
    }

    public void getTitolo(View v){
        Toast.makeText(binding.getRoot().getContext(), binding.titolo.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}