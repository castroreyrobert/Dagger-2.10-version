package com.example.myapplication.modules;

import com.example.myapplication.MainActivity;
import com.example.myapplication.contracts.MainActivityContract;
import com.example.myapplication.presenters.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by castroreyrobert on 3/18/18.
 */
@Module
public class MainActivityModule {

    @Provides
    MainActivityContract.View provideMainActivityView(MainActivity mainActivity){
        return mainActivity;
    }

    @Provides
    MainActivityPresenter  provideMainActivityPresenter(MainActivityContract.View mView) {
        return new MainActivityPresenter(mView);
    }

}
