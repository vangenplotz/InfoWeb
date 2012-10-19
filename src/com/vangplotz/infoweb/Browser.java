package com.vangplotz.infoweb;

import java.io.File;
import android.os.Bundle;
import android.os.Environment;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;


@SuppressLint("SetJavaScriptEnabled")
public class Browser extends Activity {
	File sdcard = Environment.getExternalStorageDirectory();
    File file = new File(sdcard,"/infoweb_conf.txt");
    StringBuilder text = new StringBuilder();

	private WebView webView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_browser);
        // Go full screen
        	final Window window = getWindow();
        	window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		webView = (WebView) findViewById(R.id.webView1);
		webView.loadUrl("http://app.infoskjermen.no/MKI569");  
		webView.getSettings().setJavaScriptEnabled(true);
        webView.setKeepScreenOn(true);
		webView.setInitialScale(90);
		webView.setScrollBarStyle(View.SCROLLBARS_OUTSIDE_OVERLAY);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);

   		new ReloadWebView(this, 4000, webView);
    }
}