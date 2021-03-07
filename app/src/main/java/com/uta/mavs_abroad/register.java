package com.uta.mavs_abroad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {
    public static final String TAG = "TAG";
    EditText full_name;
    EditText user_name;
    EditText password_id;
    EditText email_id;
    EditText confirm_password_id;
    Button login_btn;
    Button register_btn;

    String Email_Pattern = "[a-zA-Z0-9]+\\.+[a-zA-Z0-9]+@[mavs]+\\.+[uta]+\\.+[edu]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        full_name = (EditText) findViewById(R.id.full_name);
        user_name = (EditText) findViewById(R.id.user_name);
        email_id = (EditText) findViewById(R.id.email_id);

        password_id = (EditText) findViewById(R.id.password_id);
        confirm_password_id = (EditText) findViewById(R.id.confirm_password);
        register_btn = (Button) findViewById(R.id.register_btn);
        login_btn = (Button) findViewById(R.id.login_btn);



        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register();
            }


        });
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), loginActivity.class));
                finish();

            }
        });

    }
    private void Register(){
        final String name = full_name.getText().toString().trim();
        final String username = user_name.getText().toString().trim();
        final String email = email_id.getText().toString().trim();
        final String password = password_id.getText().toString().trim();
        String confirm_password = confirm_password_id.getText().toString().trim();

        if(TextUtils.isEmpty(name)){
            full_name.setError("Name is Required.");
            return;
        }
        if(TextUtils.isEmpty(username)){
            full_name.setError("User name is Required.");
            return;
        }
        if(TextUtils.isEmpty(email)){
            email_id.setError("email is Required.");
            return;
        }

        if(TextUtils.isEmpty(password)){
            password_id.setError("Password is Required.");
            return;
        }
        if(TextUtils.isEmpty(confirm_password)){
            confirm_password_id.setError("Confirm password");
            return;
        }
        if(password.length()<6){
            password_id.setError("Password must be 6 or more characters");
            return;
        }
        if(!password.equals(confirm_password)){
            confirm_password_id.setError("Password not matched");
            return;
        }
        if(!email.matches(Email_Pattern)){
            // if(!isValidEmail(email)){
            email_id.setError("invalid Email");
            return;
        }
    }
}