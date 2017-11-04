package com.example.davinci.proiect_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LogInPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);

        Button LogInButton = (Button) findViewById(R.id.log_in_button);
        Button SignInButton = (Button) findViewById(R.id.SignIn);
        SignInButton.getBackground().setAlpha(0);

        LogInButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent TabelSelection = new Intent(LogInPage.this, TableSelectionMenu.class);
                startActivity(TabelSelection);
            }
        });

        SignInButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(LogInPage.this, "Registration Unaviable", Toast.LENGTH_SHORT).show();
            }
        });
    }
}