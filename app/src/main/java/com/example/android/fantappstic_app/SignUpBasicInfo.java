package com.example.android.fantappstic_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.android.fantappstic_app.R.id.button_continue1;

public class SignUpBasicInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_basic_info);
        Button button_continue1 = (Button) findViewById(R.id.button_continue1);
    }
    public void onClick(View v)
    {
        if(v.getId()== R.id.button_continue1)
        {
            EditText name= (EditText)findViewById(R.id.ETname);
            EditText email= (EditText)findViewById(R.id.ETemail);
            EditText username= (EditText)findViewById(R.id.ETusername);
            EditText pnum = (EditText)findViewById(R.id.ETpnum);
            EditText pw= (EditText)findViewById(R.id.ETpw);
            EditText pw2= (EditText)findViewById(R.id.ETpw2);

            String namestr= name.getText().toString();
            String emailstr= email.getText().toString();
            String usernamestr= username.getText().toString();
            String pnumstr= pnum.getText().toString();
            String pwstr= pw.getText().toString();
            String pw2str= pw2.getText().toString();

            if(!pwstr.equals(pw2str))
            {
                Toast pass= Toast.makeText(SignUpBasicInfo.this , "Passwords don't match!", Toast.LENGTH_SHORT);
                pass.show();
            }


            Button button_continue1 = (Button) findViewById(R.id.button_continue1);
        button_continue1.setOnClickListener(new View.OnClickListener() {
            @Override
//            when sign up button is clicked it takes you to SignUpBasicInfo
            public void onClick(View v) {
                Intent GotoProfileInfo = new Intent(SignUpBasicInfo.this, profileinfo.class);
                SignUpBasicInfo.this.startActivity(GotoProfileInfo);
    }
});}}}