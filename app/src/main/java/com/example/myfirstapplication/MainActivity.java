package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
    }

    public void onClick(View v){
        Toast.makeText (this,"Я умею нажиматся", Toast.LENGTH_LONG).show ();
        // Данный метод выводит оповещение о том, что кнопка была нажата
    }

}