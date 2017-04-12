package com.egecius.demo_design_library;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		showErrorForMiddleName();
	}

	private void showErrorForMiddleName() {
		TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.middle_name_layout);
		textInputLayout.setErrorEnabled(true);
		textInputLayout.setError("Egis error");
	}
}
