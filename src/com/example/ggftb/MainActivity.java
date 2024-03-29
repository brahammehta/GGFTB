package com.example.ggftb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void sendCrowdsource(View view) {
	    //Do something in response to button
		Intent intent = new Intent(this, CrowdsourceActivity.class);
		startActivity(intent);
	}
	public void sendPicture(View view) {
	    //Do something in response to button
		Intent intent = new Intent(this, PictureActivity.class);
		startActivity(intent);
	}
	public void sendText(View view) {
	    //Do something in response to button
		Intent intent = new Intent(this, TextActivity.class);
		startActivity(intent);
	}
}
