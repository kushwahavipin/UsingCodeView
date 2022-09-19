package com.erinfa.cardview.textView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.erinfa.cardview.R;

public class TextViewKotlin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_kotlin);
        WebView TextViewKOTLIN;
        TextViewKOTLIN=findViewById(R.id.TextViewKOTLIN);
        TextViewKOTLIN.loadUrl("file:///android_asset/TextView/TextViewKotlin.html");
    }
}