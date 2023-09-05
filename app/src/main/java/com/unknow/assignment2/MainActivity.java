package com.unknow.assignment2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCount;
    TextView tvCount;
    EditText etExtend;

    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCount = findViewById(R.id.btnCounter);
        tvCount = findViewById(R.id.tvCounter);
        etExtend = findViewById(R.id.etExtended);

        btnCount.setOnClickListener(this);

        if(savedInstanceState != null){
            tvCount.setText(savedInstanceState.getString("stateEditText"));
            count = Integer.parseInt(savedInstanceState.getString("stateEditText"));
        }
    }


    @Override
    public void onClick(View v) {
        count++;
        tvCount.setText(Integer.toString(count));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("stateEditText", tvCount.getText().toString());
    }
}