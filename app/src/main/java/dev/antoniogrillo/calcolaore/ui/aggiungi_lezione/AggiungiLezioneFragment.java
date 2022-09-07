package dev.antoniogrillo.calcolaore.ui.aggiungi_lezione;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import dev.antoniogrillo.calcolaore.databinding.FragmentAggiungiLezioneBinding;

public class AggiungiLezioneFragment extends Fragment {

    private FragmentAggiungiLezioneBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AggiungiLezioneViewModel aggiungiLezioneViewModel =
                new ViewModelProvider(this).get(AggiungiLezioneViewModel.class);

        binding = FragmentAggiungiLezioneBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        aggiungiLezioneViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}