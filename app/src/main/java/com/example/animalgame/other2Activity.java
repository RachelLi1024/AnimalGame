package com.example.animalgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import static com.example.animalgame.otherActivity.score1;

public class other2Activity extends AppCompatActivity {

    private int flag = 0;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other2xml);

    }

    public void giraffeClick(View view){
        flag++;
        score = score1 + flag;
        Toast.makeText(this,"Excellent! Total score:"+ score, Toast.LENGTH_LONG).show();

       if(score == 2)
       {
           Intent intent3 = new Intent(this,endActivity.class);
           startActivity(intent3);
           finish();
       }
       else
       {
           Intent intent3 = new Intent(this,loseActivity.class);
           startActivity(intent3);
           finish();
       }
    }
    public void flowerClick(View view){
        flag--;
        score = score1 + flag;
        Toast.makeText(this,"Missed! Total score:"+ score, Toast.LENGTH_LONG).show();

        //jump to other2Activity
        Intent intent3 = new Intent(this,loseActivity.class);
        startActivity(intent3);
        finish();
    }
    public void houseClick(View view){
        flag--;
        score = score1 + flag;
        Toast.makeText(this,"Missed! Total score:"+ score, Toast.LENGTH_LONG).show();

        //jump to other2Activity
        Intent intent3 = new Intent(this,loseActivity.class);
        startActivity(intent3);
        finish();
    }
    public void eleClick(View view){
        flag--;
        score = score1 + flag;
        Toast.makeText(this,"Missed! Total score:"+ score, Toast.LENGTH_LONG).show();

        //jump to other2Activity
        Intent intent3 = new Intent(this,loseActivity.class);
        startActivity(intent3);
        finish();
    }
}

