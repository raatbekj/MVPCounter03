package com.example.mvpcounter03;

public class CounterPresenter implements CounterContracts.CounterPresenter {
    CounterContracts.CounterView counterView;
    CounterModel counterModel;

    public CounterPresenter() {
        counterModel = new CounterModel();

    }

    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateCount(counterModel.getCount());
        checkIsTen();
        checkIsFifteen();
    }

    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.updateCount(counterModel.getCount());
        checkIsTen();
        checkIsFifteen();
    }

    @Override
    public void checkIsTen() {
        if(counterModel.isTen()){
            counterView.toast();
        }
    }

    @Override
    public void checkIsFifteen() {
        if(counterModel.isFifteen()){
            counterView.setColor();
        }
    }

    @Override
    public void attachView(CounterContracts.CounterView counterView) {
        this.counterView = counterView;
    }

}
