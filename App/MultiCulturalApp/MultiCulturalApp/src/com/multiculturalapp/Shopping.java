package com.multiculturalapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Shopping extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shopping);
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}
	public void malls(final View v1) {
    	Uri malls = Uri.parse("geo:42.3149370,-83.0363630?q=shopping malls in windsor");
    	Intent mallsIntent = new Intent(Intent.ACTION_VIEW, malls);
    	mallsIntent.setPackage("com.google.android.apps.maps");
    	startActivity(mallsIntent);
        // Perform action on click
    }
	public void shoppers(final View v2) {
    	Uri shoppers = Uri.parse("geo:42.3149370,-83.0363630?q=shoppers drug mart in windsor");
    	Intent shoppersIntent = new Intent(Intent.ACTION_VIEW, shoppers);
    	shoppersIntent.setPackage("com.google.android.apps.maps");
    	startActivity(shoppersIntent);
        // Perform action on click
    }
	public void freshco(final View v4) {
    	Uri freshco = Uri.parse("geo:42.3149370,-83.0363630?q=freshco in windsor");
    	Intent freshcoIntent = new Intent(Intent.ACTION_VIEW, freshco);
    	freshcoIntent.setPackage("com.google.android.apps.maps");
    	startActivity(freshcoIntent);
        // Perform action on click
    }
	public void wallmart(final View v5) {
    	Uri wallmart = Uri.parse("geo:42.3149370,-83.0363630?q=wallmart in windsor");
    	Intent wallmartIntent = new Intent(Intent.ACTION_VIEW, wallmart);
    	wallmartIntent.setPackage("com.google.android.apps.maps");
    	startActivity(wallmartIntent);
        // Perform action on click
    }
	public void ctire(final View v6) {
    	Uri ctire = Uri.parse("geo:42.3149370,-83.0363630?q=canadian tire in windsor");
    	Intent ctireIntent = new Intent(Intent.ACTION_VIEW, ctire);
    	ctireIntent.setPackage("com.google.android.apps.maps");
    	startActivity(ctireIntent);
        // Perform action on click
    }
	public void metro(final View v7) {
    	Uri metro = Uri.parse("geo:42.3149370,-83.0363630?q=metro in windsor");
    	Intent metroIntent = new Intent(Intent.ACTION_VIEW, metro);
    	metroIntent.setPackage("com.google.android.apps.maps");
    	startActivity(metroIntent);
        // Perform action on click
    }

}
