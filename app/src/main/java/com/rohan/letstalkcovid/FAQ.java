package com.rohan.letstalkcovid;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class FAQ extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        WebView webView=new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.cdc.gov/coronavirus/2019-ncov/faq.html");
    }
}
