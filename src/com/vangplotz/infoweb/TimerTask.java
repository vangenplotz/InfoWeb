package com.vangplotz.infoweb;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.webkit.WebView;

class ReloadWebView extends TimerTask {
	    Activity context;
	    Timer timer;
	    WebView wv;

	    public ReloadWebView(Activity context, int seconds, WebView wv) {
	        this.context = context;
	        this.wv = wv;

	        timer = new Timer();
	        /* execute the first task after seconds */
	        timer.schedule(this,
	                seconds * 1000,  // initial delay
	                seconds * 1000); // subsequent rate

	        /* if you want to execute the first task immediatly */
	        /*
	        timer.schedule(this,
	                0,               // initial delay null
	                seconds * 1000); // subsequent rate
	        */
	    }

	    @Override
	    public void run() {
	        if(context == null || context.isFinishing()) {
	            // Activity killed
	            this.cancel();
	            return;
	        }

	        context.runOnUiThread(new Runnable() {
	            public void run() {
	                wv.reload();
	            }
	        });
	    }
}

