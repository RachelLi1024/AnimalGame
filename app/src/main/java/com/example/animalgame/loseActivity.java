package com.example.animalgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import static com.example.animalgame.otherActivity.score1;

public class loseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.losexml);
    }

    public void restart(View view){
        //jump to start
        Intent intent = new Intent(this,otherActivity.class);
        startActivity(intent);
        finish();
    }
    public void exit(View view){
       finish();
       // System.exit(0);
    }
}