package com.example.dell.database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText user, pass;
    private Button log, regi;
    String login_name,login_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.editText5);
        pass = (EditText) findViewById(R.id.editText6);
    }

    public void reg(View view) {

        startActivity(new Intent(this, Registration.class));
    }
    public void login(View view){
        login_name=user.getText().toString();
        login_pass=pass.getText().toString();
        String method="login";
        BackgroundTask backgroundTask=new BackgroundTask(this);
        backgroundTask.execute(method,login_name,login_pass);

    }

}