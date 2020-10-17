package com.rohan.letstalkcovid;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class CoronaVirus extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coronavirus);
        WebView webView=new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.hopkinsmedicine.org/health/conditions-and-diseases/coronavirus");
    }
}
