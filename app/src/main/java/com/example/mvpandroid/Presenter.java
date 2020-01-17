package com.example.mvpandroid;

public class Presenter {
    private Model mModel;
    private MainActivity view;
    public Presenter(MainActivity view){
        this.mModel = new Model();
        this.view = view;
    }
}
