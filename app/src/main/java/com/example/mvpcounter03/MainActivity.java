package com.example.mvpcounter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvpcounter03.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView {
    ActivityMainBinding binding;
    private CounterPresenter counterPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        counterPresenter = injector.getPresenter();
        counterPresenter.attachView(this);
        initClickers();
    }

    private void initClickers() {
        binding.decrementBtn.setOnClickListener(view -> counterPresenter.decrement());
        binding.incrementBtn.setOnClickListener(view -> counterPresenter.increment());


    }

    @Override
    public void updateCount(int count) {
        binding.counterTv.setTextColor(getResources().getColor(R.color.black));
        binding.counterTv.setText(String.valueOf(count));

    }

    @Override
    public void toast() {
        Toast.makeText(this,"Поздравляю" , Toast.LENGTH_LONG).show();
    }

    @Override
    public void setColor() {
        binding.counterTv.setTextColor(getResources().getColor(R.color.teal_700));
    }


}