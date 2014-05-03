package com.example.ggftb;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class TextActivity extends Activity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.text);
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
            //Test test test 
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
}
