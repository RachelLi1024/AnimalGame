package com.example.animalgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class otherActivity extends AppCompatActivity {
    private int flag1 = 0;
    public static int score1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otherxml);
    }

    public void pigClick(View view){
        flag1++;
        score1 = MainActivity.score + flag1;

        Toast.makeText(this,"Excellent! Total score:"+ score1, Toast.LENGTH_LONG).show();

        //jump to other2Activity
        Intent intent2 = new Intent(this,other2Activity.class);
      //  intent2.putExtra("second",2);
      //  intent2.setClass(otherActivity.class,other2Activity.this);
        startActivity(intent2);

        finish();
    }

   public void bearClick(View view){
        flag1--;
        score1 = MainActivity.score + flag1;
        Toast.makeText(this,"Missed! Total score:"+ score1, Toast.LENGTH_LONG).show();

        //jump to other2Activity
        Intent intent = new Intent(this,other2Activity.class);
        startActivity(intent);
       finish();
    }

    public void beeClick(View view){
        flag1--;
        score1 = MainActivity.score + flag1;
        Toast.makeText(this,"Missed! Total score:"+ score1, Toast.LENGTH_LONG).show();

        //jump to other2Activity
        Intent intent = new Intent(this,other2Activity.class);
        startActivity(intent);
        finish();
    }
    public void fishClick(View view){
        flag1--;
        score1 = MainActivity.score + flag1;
        Toast.makeText(this,"Missed! Total score:"+ score1, Toast.LENGTH_LONG).show();

        //jump to other2Activity
        Intent intent = new Intent(this,other2Activity.class);
        startActivity(intent);
        finish();
    }

}