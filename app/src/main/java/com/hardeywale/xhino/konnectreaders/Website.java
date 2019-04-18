package com.hardeywale.xhino.konnectreaders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Website extends AppCompatActivity {

    String url = "http://learn.futa.edu.ng";


    WebView wv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Ensure you have Active Internet Connection ", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_website);




        wv = (WebView) findViewById(R.id.webview);
        wv.setWebChromeClient(new WebChromeClient());
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.loadUrl(url);


    }

    @Override
    public void onBackPressed() {
      if(wv.canGoBack()){
          wv.goBack();
      }
      else{
          super.onBackPressed();
      }
    }
}
