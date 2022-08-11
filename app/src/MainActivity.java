package com.example.cardock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button loginBtn;
    public static String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginBtn = findViewById(R.id.loginbtn);

        AppUser appuser = new AppUser();
        appuser.setName("name");
        appuser.setPassword("password");

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(appuser.validateLogin(user, pass))
                {
                    name = user;
                    Intent intent = new Intent(MainActivity.this, CarRegistration.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Try again!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}