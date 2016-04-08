package com.multiculturalapp;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Healthcare extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_healthcare);
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}
	public void onLocationChanged(Location loc) {
		Double lat = loc.getLatitude();
		Double lng = loc.getLongitude();
		}
	public void openAddress(final View v) {
    	Uri address = Uri.parse("google.navigation:q=CAW+Student+Center,University+of+Windsor");
    	Intent addressIntent = new Intent(Intent.ACTION_VIEW, address);
    	addressIntent.setPackage("com.google.android.apps.maps");
    	startActivity(addressIntent);
	}
	public void healthcare(final View v1) {
    	Uri health = Uri.parse("geo:42.3149370,-83.0363630?q=healthcare");
    	Intent healthIntent = new Intent(Intent.ACTION_VIEW, health);
    	healthIntent.setPackage("com.google.android.apps.maps");
    	startActivity(healthIntent);
        // Perform action on click
    }
}
