package com.multiculturalapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class PublicServices extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_public_services);
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}
	public void policeStation(final View v) {
    	Uri police = Uri.parse("geo:42.3149370,-83.0363630?q=police station in windsor");
    	Intent policeIntent = new Intent(Intent.ACTION_VIEW, police);
    	policeIntent.setPackage("com.google.android.apps.maps");
    	startActivity(policeIntent);
        // Perform action on click
    }
	public void serviceOntario(final View v2) {
    	Uri service = Uri.parse("geo:42.3149370,-83.0363630?q=service ontario in windsor");
    	Intent serviceIntent = new Intent(Intent.ACTION_VIEW, service);
    	serviceIntent.setPackage("com.google.android.apps.maps");
    	startActivity(serviceIntent);
        // Perform action on click
    }
	public void scotiaBank(final View v3) {
    	Uri scotia = Uri.parse("geo:42.3149370,-83.0363630?q=scotia bank in windsor");
    	Intent scotiaIntent = new Intent(Intent.ACTION_VIEW, scotia);
    	scotiaIntent.setPackage("com.google.android.apps.maps");
    	startActivity(scotiaIntent);
        // Perform action on click
    }
	public void rbc(final View v4) {
    	Uri rbcb = Uri.parse("geo:42.3149370,-83.0363630?q=rbc bank in windsor");
    	Intent rbcbIntent = new Intent(Intent.ACTION_VIEW, rbcb);
    	rbcbIntent.setPackage("com.google.android.apps.maps");
    	startActivity(rbcbIntent);
        // Perform action on click
    }
	public void td(final View v5) {
    	Uri tdb = Uri.parse("geo:42.3149370,-83.0363630?q=td bank in windsor");
    	Intent tdbIntent = new Intent(Intent.ACTION_VIEW, tdb);
    	tdbIntent.setPackage("com.google.android.apps.maps");
    	startActivity(tdbIntent);
        // Perform action on click
    }
	public void cibc(final View v6) {
    	Uri cibcb = Uri.parse("geo:42.3149370,-83.0363630?q=cibc bank in windsor");
    	Intent cibcbIntent = new Intent(Intent.ACTION_VIEW, cibcb);
    	cibcbIntent.setPackage("com.google.android.apps.maps");
    	startActivity(cibcbIntent);
        // Perform action on click
    }

}
