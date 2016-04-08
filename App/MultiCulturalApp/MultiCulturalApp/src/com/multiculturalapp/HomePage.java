package com.multiculturalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class HomePage extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}
	public void worshipPlaces(final View v) {
		Intent intent=new Intent(v.getContext(),WorshipPlaces.class);
		startActivityForResult(intent,0);
	}
	public void foodCravings(final View v1) {
		Intent intent1=new Intent(v1.getContext(),FoodCravings.class);
		startActivityForResult(intent1,0);
	}
	public void healthcare(final View v2)
	{
		Intent intent2=new Intent(v2.getContext(),Healthcare.class);
		startActivityForResult(intent2,0);
	}
	public void publicServices(final View v3)
	{
		Intent intent3=new Intent(v3.getContext(),PublicServices.class);
		startActivityForResult(intent3,0);
	}
	public void leisure(final View v4)
	{
		Intent intent4=new Intent(v4.getContext(),Leisure.class);
		startActivityForResult(intent4,0);
	}
	public void shopping(final View v5)
	{
		Intent intent5=new Intent(v5.getContext(),Shopping.class);
		startActivityForResult(intent5,0);
	}
}
