package br.com.aula05;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela1 extends Activity {

	Button btnTela1;
	EditText txtNome;
	Bundle params;	
	Button btnSair;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);
	
		//Carrega a tela principal
		setContentView(R.layout.activity_tela1);
		
		//Cria uma variavel para capturar o valor digitado
		txtNome = (EditText) findViewById(R.id.editText1);
		
		btnTela1 = (Button) findViewById(R.id.button1);
		
		btnTela1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Cria uma Intent para armazenar os dados
				Intent itTela2 = new Intent(Tela1.this, MainActivity.class);
				
				Bundle params = new Bundle();
				
				//gravar o valor na outra tela
				
				params.putString("nome", txtNome.getText().toString());
				
				//Limpa o campo na tela 1
				txtNome.setText("");
				
				itTela2.putExtras(params);
				
				startActivity(itTela2);		
			}
		});
		
		btnSair = (Button) findViewById(R.id.btnSair);
		
		btnSair.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
	
	}

	
}
