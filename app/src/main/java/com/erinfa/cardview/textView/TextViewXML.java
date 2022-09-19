package com.erinfa.cardview.textView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.erinfa.cardview.R;

public class TextViewXML extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_xml);
        WebView TextViewXML;
        TextViewXML=findViewById(R.id.TextViewXML);
        TextViewXML.loadUrl("file:///android_asset/TextView/TextViewXML.html");
    }
}