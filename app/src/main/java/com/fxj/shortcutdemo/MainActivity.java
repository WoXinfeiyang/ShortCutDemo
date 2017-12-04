package com.fxj.shortcutdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static String TAG=MainActivity.class.getSimpleName();
    private Button addShortCutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.addShortCutBtn=(Button) findViewById(R.id.add_short_cut);
        this.addShortCutBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.i(TAG,"onClick");
                Intent launchIntent=new Intent(Intent.ACTION_MAIN);
                launchIntent.setClass(MainActivity.this,MainActivity.class);
                launchIntent.addCategory(Intent.CATEGORY_LAUNCHER);
                ShortCutUtils.addShortCut(getApplicationContext(),R.drawable.cloud,"快捷方式",launchIntent);
            }
        });
    }
}
