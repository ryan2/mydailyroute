package com.example.logincounter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
public class LoginCounter extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_counter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_counter, menu);
		return true;
	}
	
	public void sendAdd(View view) {
		Intent intent = new Intent(this, AddUserActivity.class);
		EditText editText = (EditText) findViewById(R.id.user_message);
		String user = editText.getText().toString();
		editText = (EditText) findViewById(R.id.password_message);
		String pass = editText.getText().toString();
		intent.putExtra(EXTRA_USER, user);
		intent.putExtra(EXTRA_PASS,pass);
		startActivity(intent);
		
	}

}
