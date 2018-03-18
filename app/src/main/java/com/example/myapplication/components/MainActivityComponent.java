package com.example.myapplication.components;

import com.example.myapplication.MainActivity;
import com.example.myapplication.modules.MainActivityModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by castroreyrobert on 3/17/18.
 */
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
}
