package com.edu.swun.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView  mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText= (TextView) findViewById(R.id.nihao);
        mText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mText.setText("不好");
            }
        });
    }
}
