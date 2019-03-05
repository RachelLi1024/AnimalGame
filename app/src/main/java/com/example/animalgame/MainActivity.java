package com.example.animalgame;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public static int score = 0;
   // private TextView textGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  textGame = (TextView)findViewById(R.id.textView);
        textGame.setTypeface(Typeface.createFromAsset(getAssets(),"Fonts/Roboto-regular.ttf"));*/
    }

    //jump to otherActivity when START is clicked
    public void btnClick(View view){
        Intent intent1 = new Intent();
        intent1.setClass(MainActivity.this,otherActivity.class);
        startActivity(intent1);

       // finish();
    }

    public void exitMain(View view){
        //finish();
        System.exit(0);
    }

  /*  TextView textView = getTextView();

    //修改字体
    Typeface typeFace = Typeface.createFromAsset(getAssets(),"Fonts/Roboto-regular.ttf");
    // 应用字体
    textView.setTypeface(typeFace);
*/
}
