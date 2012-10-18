package com.vangplotz.infoweb;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.webkit.WebView;

@SuppressLint("SetJavaScriptEnabled") public class Browser extends Activity {
	 private WebView webView;
	 
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

		webView = (WebView) findViewById(R.id.webView1);
		webView.setInitialScale(95);

		webView.getSettings().setJavaScriptEnabled(true);
		
		webView.loadUrl("https://web.timeedit.se/hil_no/db1/dagens/r.html?base=c2lkPTMmb2JqZWN0cz0xNjExNTUuMTg1JTJDMTYxMTU2LjE4NSUyQzE2MTE1Ny4xODUlMkMxNjExNTguMTg1JTJDMTYxMTU5LjE4NSUyQzE2MTE2MC4xODUlMkMxNjExNjEuMTg1JTJDMTYxMTYyLjE4NSUyQzE2MTE5OS4xODUlMkMxNjEyMDAuMTg1JTJDMTYxMjAxLjE4NSUyQzE2MTIwMi4xODUlMkMxNjEyMDMuMTg1JTJDMTYxMjA1LjE4NSUyQzE2MTIwNC4xODUlMkMxNjEyMTIuMTg1JTJDMTYxMjEzLjE4NSUyQzE2MTE5Ni4xODUlMkMxNjExOTcuMTg1JTJDMTYxMTk4LjE4NSZveD0wJmgyPWYmY2NoPTE4MiUyQzE4OS0rLmY0MS1Lb21tZW50YXIuZjItKy5mNDctKyZwPTAuZGF5cyUyQzAuZGF5cyZoPWY_");  
    }
}