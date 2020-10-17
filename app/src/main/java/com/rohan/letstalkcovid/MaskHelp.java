package com.rohan.letstalkcovid;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MaskHelp extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maskhelp);
        WebView webView=new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.cdc.gov/coronavirus/2019-ncov/prevent-getting-sick/cloth-face-cover-guidance.html");
    }
}
