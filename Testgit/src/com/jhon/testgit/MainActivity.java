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
		System.err.println("I am jhon");
		System.err.println("I am jhon4");
		System.err.println("I am jhon5");
		System.err.println("I am jhon1");
		System.err.println("I am jhon2");
		System.err.println("I am bbbbbbbbbbbbbbb");
		System.err.println("56789-009090");
		System.err.println("567-00000000000000");
		System.err.println("567890000000");

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
