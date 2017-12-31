package com.example.android.fantappstic_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_login);
// initialized variables here
        Button login_button = (Button) findViewById(R.id.login_button);
        final EditText user_field = (EditText)findViewById(R.id.user_field);
        final EditText pass_field = (EditText)findViewById(R.id.pass_field);

        Button signup_button = (Button) findViewById(R.id.signup_button);
// set Login_button to have something to do when clicked

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // if the username is codergals and password is 12345 in the user_field and pass_field go to the home screen
                if(user_field.getText().toString().equals("codergal") && pass_field.getText().toString().equals("12345"))
                {
                    Intent GotoHomeScreen = new Intent(FirstLogin.this, HomeScreen.class);
                    FirstLogin.this.startActivity(GotoHomeScreen);
            }
//            else if the password is wrong show a message saying word credentials
                else
                {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

        }

    }
});
        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
//            when sign up button is clicked it takes you to SignUpBasicInfo
            public void onClick(View v) {
                Intent GotoSignUpBasic = new Intent(FirstLogin.this, SignUpBasicInfo.class);
                FirstLogin.this.startActivity(GotoSignUpBasic);
            }
        });
    }}