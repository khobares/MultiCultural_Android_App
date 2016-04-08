package com.multiculturalapp;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class WorshipPlaces extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_worship_places);
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}
	public void onLocationChanged(Location loc) {
		Double lat = loc.getLatitude();
		Double lng = loc.getLongitude();
		}
	public void catholic(final View v1) {
    	Uri cath = Uri.parse("geo:42.3149370,-83.0363630?q=catholic churches");
    	Intent catholicIntent = new Intent(Intent.ACTION_VIEW, cath);
    	catholicIntent.setPackage("com.google.android.apps.maps");
    	startActivity(catholicIntent);
        // Perform action on click
    }
	public void buddhistTemple(final View v2)
	{
		Uri bT=Uri.parse("geo:42.3149370,-83.0363630?q=buddhist temples");
		Intent buddhaIntent = new Intent(Intent.ACTION_VIEW, bT);
    	buddhaIntent.setPackage("com.google.android.apps.maps");
    	startActivity(buddhaIntent);
		
	}
	public void protestant(final View v3)
	{
		Uri prot=Uri.parse("geo:42.3149370,-83.0363630?q=protestant churches");
		Intent protIntent = new Intent(Intent.ACTION_VIEW, prot);
    	protIntent.setPackage("com.google.android.apps.maps");
    	startActivity(protIntent);
		
	}
	public void gurudwara(final View v4)
	{
		Uri guru=Uri.parse("geo:42.3149370,-83.0363630?q=gurudwaras in windsor");
		Intent guruIntent = new Intent(Intent.ACTION_VIEW, guru);
    	guruIntent.setPackage("com.google.android.apps.maps");
    	startActivity(guruIntent);
		
	}
	public void hinduTemple(final View v5)
	{
		Uri hindu=Uri.parse("geo:42.3149370,-83.0363630?q=hindu temples");
		Intent hinduIntent = new Intent(Intent.ACTION_VIEW, hindu);
    	hinduIntent.setPackage("com.google.android.apps.maps");
    	startActivity(hinduIntent);
		
	}
	public void mosque(final View v2)
	{
		Uri mosque=Uri.parse("geo:42.3149370,-83.0363630?q=mosques");
		Intent mosqueIntent = new Intent(Intent.ACTION_VIEW, mosque);
    	mosqueIntent.setPackage("com.google.android.apps.maps");
    	startActivity(mosqueIntent);
		
	}

}
