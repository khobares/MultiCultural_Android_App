package com.multiculturalapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Casino extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_casino);
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}
	public void caesars(final View v) {
    	Uri address = Uri.parse("google.navigation:q=377+Riverside+Drive+East,Windsor");
    	Intent addressIntent = new Intent(Intent.ACTION_VIEW, address);
    	addressIntent.setPackage("com.google.android.apps.maps");
    	startActivity(addressIntent);
	}

}
