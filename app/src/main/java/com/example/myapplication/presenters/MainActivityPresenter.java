package com.example.myapplication.presenters;

import com.example.myapplication.MainActivity;
import com.example.myapplication.base.BasePresenter;
import com.example.myapplication.contracts.MainActivityContract;

/**
 * Created by castroreyrobert on 3/18/18.
 */

public class MainActivityPresenter extends BasePresenter<MainActivityContract.View> {

    private MainActivityContract.View mView;

    public MainActivityPresenter(MainActivityContract.View view) {
        mView = view;
    }
}
