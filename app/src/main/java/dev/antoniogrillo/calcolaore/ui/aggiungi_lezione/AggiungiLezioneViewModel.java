package dev.antoniogrillo.calcolaore.ui.aggiungi_lezione;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AggiungiLezioneViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AggiungiLezioneViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}