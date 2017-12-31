package com.example.android.fantappstic_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profileinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileinfo);
        Button button_continue = (Button) findViewById(R.id.button_continue);



        button_continue.setOnClickListener(new View.OnClickListener() {
            @Override
//            when sign up button is clicked it takes you to SignUpBasicInfo
            public void onClick(View v) {
                Intent GotoCircleInfo = new Intent(profileinfo.this, CircleInfo.class);
                profileinfo.this.startActivity(GotoCircleInfo);
    }
});}}
