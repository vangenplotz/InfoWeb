package com.vangplotz.infoweb;

import java.io.File;
import android.os.Bundle;
import android.os.Environment;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.pm.ActivityInfo;
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
		webView.loadUrl("http://app.infoskjermen.no/PAL831");  
		//webView.loadUrl("https://web.timeedit.se/hil_no/db1/dagens/r.html?base=c2lkPTMmb2JqZWN0cz14LjcuQXVkaXRvcml1bS5LbGFzc2Vyb20uMTg1LiZveD0wJmNjaD0xODIlMkMxODktKy5mNDEtS29tbWVudGFyLmYyLSsuZjQ3LSsmcD0wLm1pbnV0ZXMlMkMwLmRheXMmaD1mJmgyPWY_"); 
		webView.getSettings().setJavaScriptEnabled(true);
        webView.setKeepScreenOn(true);
		webView.setInitialScale(110);
		webView.setScrollBarStyle(View.SCROLLBARS_OUTSIDE_OVERLAY);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
   		new ReloadWebView(this, 60, webView);
    }
}