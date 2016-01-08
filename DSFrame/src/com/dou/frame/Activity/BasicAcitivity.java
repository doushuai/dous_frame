package com.dou.frame.Activity;

import com.dou.dsframe.Activity.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class BasicAcitivity extends Activity{
	private LinearLayout mLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}
	
	private void init() {
		
		if (mLayout == null) {
			mLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.layout_main, null);
		}
		
		setContentView(mLayout);
	}
}
