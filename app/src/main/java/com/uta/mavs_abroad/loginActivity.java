package com.uta.mavs_abroad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class loginActivity extends AppCompatActivity {
    EditText email_id;
    EditText password_id;
    Button login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        {
            email_id = (EditText)findViewById(R.id.email_id);
            password_id = (EditText)findViewById(R.id.password_id);
            login_btn = (Button)findViewById(R.id.login_btn);
            login_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Login();
                }
            });
            });
        }
        private void Login(){

            String email = email_id.getText().toString().trim();
            String password = password_id.getText().toString().trim();


            if(TextUtils.isEmpty(email)){
                email_id.setError("email is Required.");
                return;
            }

            if(TextUtils.isEmpty(password)){
                password_id.setError("Password is Required.");
                return;
            }
            });

        }

    }