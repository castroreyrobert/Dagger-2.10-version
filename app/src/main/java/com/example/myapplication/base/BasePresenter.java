package com.example.myapplication.base;

/**
 * Created by castroreyrobert on 3/18/18.
 */

public abstract class BasePresenter<T> {

    private T view;

    public void attachView(T view){
        this.view = view;
    }

    public T getView(){
        return view;
    }

    public void destroyView(){
        view = null;
    }
}
