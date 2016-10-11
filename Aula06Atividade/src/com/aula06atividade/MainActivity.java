package com.aula06atividade;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	 Button btnTela2;
	 Button btnSair;

	 EditText txtValo1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		txtValo1 = (EditText) findViewById(R.id.editTextValor1);
		
		btnTela2 = (Button) findViewById(R.id.btnTela2);
		btnSair = (Button) findViewById(R.id.btnFechar);
		
		btnTela2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(MainActivity.this, Tela02.class);
				intent.putExtra("Tela2", txtValo1.getText().toString());
				
				startActivity(intent);
				
			}
		});
		
		btnSair.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	
	}

	
}
