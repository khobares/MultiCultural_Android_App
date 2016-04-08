package com.multiculturalapp;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class FoodCravings extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_food_cravings);
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}
	public void onLocationChanged(Location loc) {
		Double lat = loc.getLatitude();
		Double lng = loc.getLongitude();
		}
	public void halal(final View v1) {
    	Uri halal = Uri.parse("geo:42.3149370,-83.0363630?q=halal restaurants in windsor");
    	Intent halalIntent = new Intent(Intent.ACTION_VIEW, halal);
    	halalIntent.setPackage("com.google.android.apps.maps");
    	startActivity(halalIntent);
        // Perform action on click
    }
	public void indian(final View v2) {
    	Uri indian = Uri.parse("geo:42.3149370,-83.0363630?q=indian restaurants in windsor");
    	Intent indianIntent = new Intent(Intent.ACTION_VIEW, indian);
    	indianIntent.setPackage("com.google.android.apps.maps");
    	startActivity(indianIntent);
        // Perform action on click
    }
	public void italian(final View v3) {
    	Uri italian = Uri.parse("geo:42.3149370,-83.0363630?q=italian restaurants in windsor");
    	Intent italianIntent = new Intent(Intent.ACTION_VIEW, italian);
    	italianIntent.setPackage("com.google.android.apps.maps");
    	startActivity(italianIntent);
        // Perform action on click
    }
	public void asian(final View v4) {
    	Uri asian = Uri.parse("geo:42.3149370,-83.0363630?q=asian restaurants in windsor");
    	Intent asianIntent = new Intent(Intent.ACTION_VIEW, asian);
    	asianIntent.setPackage("com.google.android.apps.maps");
    	startActivity(asianIntent);
        // Perform action on click
    }
	public void greek(final View v5) {
    	Uri greek = Uri.parse("geo:42.3149370,-83.0363630?q=greek restaurants in windsor");
    	Intent greekIntent = new Intent(Intent.ACTION_VIEW, greek);
    	greekIntent.setPackage("com.google.android.apps.maps");
    	startActivity(greekIntent);
        // Perform action on click
    }
	public void canadian(final View v6) {
    	Uri canadian = Uri.parse("geo:42.3149370,-83.0363630?q=canadian restaurants in windsor");
    	Intent canadianIntent = new Intent(Intent.ACTION_VIEW, canadian);
    	canadianIntent.setPackage("com.google.android.apps.maps");
    	startActivity(canadianIntent);
        // Perform action on click
    }
}
