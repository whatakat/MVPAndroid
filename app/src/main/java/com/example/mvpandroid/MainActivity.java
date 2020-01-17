package com.example.mvpandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {
    private Button btnCounter1;
    private Button btnCounter2;
    private Button btnCounter3;
    private Presenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCounter1 = (Button)findViewById(R.id.btnCounter1);
        btnCounter2 = (Button)findViewById(R.id.btnCounter2);
        btnCounter3 = (Button)findViewById(R.id.btnCounter3);
        btnCounter1.setOnClickListener(this);
        btnCounter2.setOnClickListener(this);
        btnCounter3.setOnClickListener(this);
        mPresenter = new Presenter(this);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void setButtonText(int btnIndex, int value) {
        switch (btnIndex){
            case 1:
                btnCounter1.setText("Amount = "+ value);
                break;
            case 2:
                btnCounter2.setText("Amount = "+value);
                break;
            case 3:
                btnCounter3.setText("Amount = "+value);
                break;
        }
    }
}
