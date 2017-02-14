package com.virjanand.textfielddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void login(View view){

        EditText nameField = (EditText) findViewById(R.id.nameField);
        EditText passwordField = (EditText) findViewById(R.id.passwordField);

        Log.i("Username", nameField.getText().toString());
        Log.i("Password", passwordField.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
