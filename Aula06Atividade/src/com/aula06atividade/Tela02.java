package com.aula06atividade;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela02 extends Activity {

	public EditText txtValo2;
	public EditText txtValo3;
	public TextView txtResult;
	public Button btnConcatenar;
	public Button voltar;
	String  valor1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_tela02);
		
		Intent intent = getIntent();
		Bundle parans = intent.getExtras();
		 valor1 = parans.getString("Tela2");
		
		
		txtValo2 = (EditText)  findViewById(R.id.editTextValor2);
		
		txtValo3 = (EditText)  findViewById(R.id.editTextValor3);
		
		txtResult = (TextView) findViewById(R.id.textViewResultado);
		
		btnConcatenar = (Button) findViewById(R.id.btnConcatenar);
		
		voltar = (Button) findViewById(R.id.btnVoltar);
		
		
		btnConcatenar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				txtResult.setText(valor1 + " " + txtValo2.getText().toString() + " " 
						+ txtValo3.getText().toString());
				
				
			}
		});
		
		voltar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
	}

}
