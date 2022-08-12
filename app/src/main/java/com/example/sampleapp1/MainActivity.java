package com.example.sampleapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void show_custom_toast(View v)
    {
        LayoutInflater li =getLayoutInflater();
        View layout_view=li.inflate(R.layout.custom_toast_layout1,findViewById(R.id.ll_root));

        TextView txt_view_toast=layout_view.findViewById(R.id.txt_view_1);

        txt_view_toast.setText("Hi welcome to Android Programming");


        Toast t=new Toast(getApplicationContext());
        t.setView(layout_view);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();
        //Toast.makeText(this, "custom toast", Toast.LENGTH_SHORT).show();
    }
}