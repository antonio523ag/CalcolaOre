package dev.antoniogrillo.calcolaore.ui.visualizza_dati;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import dev.antoniogrillo.calcolaore.databinding.FragmentVisualizzaDatiBinding;

public class VisualizzaDatiFragment extends Fragment {

    private FragmentVisualizzaDatiBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        VisualizzaDatiViewModel visualizzaDatiViewModel =
                new ViewModelProvider(this).get(VisualizzaDatiViewModel.class);

        binding = FragmentVisualizzaDatiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        visualizzaDatiViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}