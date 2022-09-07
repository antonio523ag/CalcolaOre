package dev.antoniogrillo.calcolaore.ui.visualizza_dati;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VisualizzaDatiViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public VisualizzaDatiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}