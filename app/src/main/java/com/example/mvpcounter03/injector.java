package com.example.mvpcounter03;

public class injector {

    public static CounterPresenter getPresenter(){
        return new CounterPresenter();

    }
}
