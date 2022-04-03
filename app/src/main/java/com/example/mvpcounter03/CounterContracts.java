package com.example.mvpcounter03;

public class CounterContracts {


    public interface CounterView {
        void updateCount(int count);
        void toast();
        void setColor();
    }

    public interface CounterPresenter {
        void increment();

        void decrement();
        void checkIsTen();
        void checkIsFifteen();

        void attachView(CounterView counterView);
    }
}
