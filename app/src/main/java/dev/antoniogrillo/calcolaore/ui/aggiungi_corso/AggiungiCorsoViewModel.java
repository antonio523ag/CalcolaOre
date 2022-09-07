package dev.antoniogrillo.calcolaore.ui.aggiungi_corso;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AggiungiCorsoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;


    public AggiungiCorsoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}