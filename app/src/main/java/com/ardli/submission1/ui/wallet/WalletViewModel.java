package com.ardli.submission1.ui.wallet;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WalletViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WalletViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Halaman My Wallet");
    }

    public LiveData<String> getText() {
        return mText;
    }
}