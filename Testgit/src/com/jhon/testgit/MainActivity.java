package com.jhon.testgit;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.err.println("I am run 1");
		System.err.println("I am run 2");
		System.err.println("I am run 3");
		System.err.println("I am run 4");
		System.err.println("I am run 5");
		System.err.println("I am run 7");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
