package com.example.dell.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    private EditText ename,eusername,epassword;
    String id,name,user_name,user_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
      //  eid=(EditText)findViewById(R.id.editText);
        ename=(EditText)findViewById(R.id.editText2);
        eusername=(EditText)findViewById(R.id.editText3);
        epassword=(EditText)findViewById(R.id.editText4);
    }
    public void userreg(View view){
     //  id=eid.getText().toString();
        name=ename.getText().toString();
        user_name=eusername.getText().toString();
        user_pass=epassword.getText().toString();
        String method ="Register";
        BackgroundTask backgroundTask=new BackgroundTask(this);
        backgroundTask.execute(method,name,user_name,user_pass);
       // finish();
    }
}
