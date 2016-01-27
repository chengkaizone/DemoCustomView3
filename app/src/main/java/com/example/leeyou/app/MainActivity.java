package com.example.leeyou.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_font = (Button) findViewById(R.id.btn_font);
        btn_font.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FontActivity.class));
            }
        });

        Button btn_maskfilter = (Button) findViewById(R.id.btn_maskfilter);
        btn_maskfilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MaskFilterActivity.class));
            }
        });

        Button btn_shadow = (Button) findViewById(R.id.btn_shadow);
        btn_shadow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ShadowActivity.class));
            }
        });
    }
}
