package br.com.aula05;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button btnTela2;
	TextView msg;
	Bundle params;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		msg = (TextView) findViewById(R.id.txtResultado);
		
		//Recupera a Intent
		
		Intent it = getIntent();
		if (it != null){
			Bundle params = it.getExtras();
			if (params != null){
					String nome = params.getString("nome");
					msg.setText("Hello " + nome.toUpperCase() + ", Welcome");
			}
		}
		btnTela2 = (Button) findViewById(R.id.button1);
		
		btnTela2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
	}
}
