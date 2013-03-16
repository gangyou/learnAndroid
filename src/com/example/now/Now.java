package com.example.now;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Now extends Activity implements OnClickListener {

	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_now);

		btn = (Button) findViewById(R.id.buttron);
		btn.setOnClickListener(this);
		updateTime();
	}

	private void updateTime() {
		btn.setText(new Date().toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_now, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		updateTime();
	}

}
