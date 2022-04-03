package com.example.mvpcounter03;

public class CounterModel {

    private int count = 0;
    private boolean T = false;
    private boolean Ft = false;

    public void increment() {
        count++;
        switch (count){
            case  10:
                T = true ;
                Ft = false ;
                break;
            case  15:
                Ft = true ;
                T = false ;
                break;
            default:
                T = false;
                Ft = false ;
                break;
        }
    }

    public void decrement() {
        count--;
        switch (count){
            case  10:
                T = true ;
                Ft = false ;
                break;
            case  15:
                Ft = true ;
                T = false ;
                break;
            default:
                T = false;
                Ft = false ;
                break;
        }
    }

    public int getCount() {
        return count;
    }

    public boolean isTen() {
        return T;
    }

    public boolean isFifteen() {
        return Ft;
    }
}