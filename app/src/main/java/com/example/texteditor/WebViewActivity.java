package com.example.texteditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        Intent intent=getIntent();
        if (intent.getStringExtra("html").isEmpty()){
            Toast.makeText(this, "Data is not exists", Toast.LENGTH_SHORT).show();
            return;
        }
        WebView mywebview = (WebView) findViewById(R.id.webView);
        String data = intent.getStringExtra("html");
        mywebview.loadData(data, "text/html", "UTF-8");
    }
}