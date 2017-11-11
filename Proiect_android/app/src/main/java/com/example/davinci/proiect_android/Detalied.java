package com.example.davinci.proiect_android;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class Detalied extends AppCompatActivity {

    TextView domain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalied);

        domain = (TextView) findViewById(R.id.domain);

        Bundle mBundle = getIntent().getExtras();
        if(mBundle != null){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                domain.setText(mBundle.getString("domain"));
            }
        }

    }
}
