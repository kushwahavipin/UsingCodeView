package com.erinfa.cardview.textView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.erinfa.cardview.R;

public class TextViewJAVA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_java);
        WebView TextViewJAVA;
        TextViewJAVA=findViewById(R.id.TextViewJAVA);
        TextViewJAVA.loadUrl("file:///android_asset/TextView/TextViewJava.html");
    }
}