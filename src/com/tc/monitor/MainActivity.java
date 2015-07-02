package com.tc.monitor;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button buttontn = (Button)findViewById(R.id.button1);
		buttontn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//得到textview实例
                //TextView hellotv = (TextView)findViewById(R.id.textView1);
                //弹出Toast提示按钮被点击了
                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
                //读取strings.xml定义的interact_message信息并写到textview上
                //hellotv.setText(R.string.hello_world);
				
			}
		});
		
		
	}
	
	 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
