package com.example.animalgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class endActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.endxml);
    }
    public void restart1(View view){
        //jump to start
        Intent intent = new Intent(this,otherActivity.class);
        startActivity(intent);
        finish();
    }
    public void exit1(View view){
       finish();
        //System.exit(0);
    }
}
