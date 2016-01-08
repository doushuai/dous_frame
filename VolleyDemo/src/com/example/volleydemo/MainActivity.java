package com.example.volleydemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity{

	private LinearLayout mLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}
	
	private void init() {
		if (mLayout == null) {
			mLayout = getLayoutInflater().inflate(R.layout.layout_main, null)
		}
	}
}
