package com.multiculturalapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Leisure extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_leisure);
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}
	public void movies(final View v1) {
    	Uri movies = Uri.parse("geo:42.3149370,-83.0363630?q=movie theatres in windsor");
    	Intent moviesIntent = new Intent(Intent.ACTION_VIEW, movies);
    	moviesIntent.setPackage("com.google.android.apps.maps");
    	startActivity(moviesIntent);
        // Perform action on click
    }
	public void parks(final View v2) {
    	Uri parks = Uri.parse("geo:42.3149370,-83.0363630?q=parks in windsor");
    	Intent parksIntent = new Intent(Intent.ACTION_VIEW, parks);
    	parksIntent.setPackage("com.google.android.apps.maps");
    	startActivity(parksIntent);
        // Perform action on click
    }
	public void nclubs(final View v3) {
    	Uri nclubs = Uri.parse("geo:42.3149370,-83.0363630?q=night clubs in windsor");
    	Intent nclubsIntent = new Intent(Intent.ACTION_VIEW, nclubs);
    	nclubsIntent.setPackage("com.google.android.apps.maps");
    	startActivity(nclubsIntent);
        // Perform action on click
    }
	public void concert(final View v4) {
    	Uri concert = Uri.parse("geo:42.3149370,-83.0363630?q=concert halls in windsor");
    	Intent concertIntent = new Intent(Intent.ACTION_VIEW, concert);
    	concertIntent.setPackage("com.google.android.apps.maps");
    	startActivity(concertIntent);
        // Perform action on click
    }
	public void casino(final View v5)
	{
		Intent intent1=new Intent(v5.getContext(),Casino.class);
		startActivityForResult(intent1,0);
	}
	public void wparks(final View v6) {
    	Uri address = Uri.parse("google.navigation:q=401+Pitt+Street+West,Windsor");
    	Intent addressIntent = new Intent(Intent.ACTION_VIEW, address);
    	addressIntent.setPackage("com.google.android.apps.maps");
    	startActivity(addressIntent);
	}
}
