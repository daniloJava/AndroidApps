package br.com.atividadeintents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SegundaTela extends Activity {

	private Button btnAvanca;
	private EditText segundoNome;
	private String priNome;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda_tela);
		
		 btnAvanca  = (Button) findViewById(R.id.btnAvancar);
	     segundoNome = (EditText) findViewById(R.id.editTextPrimeiroNome);
	     
	     Intent intent = getIntent();
	     Bundle params = intent.getExtras();
	     
	     priNome = params.getString("primeiroNomeShow");
	     
	     
	     btnAvanca.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent i = new Intent(getApplicationContext(), TerceiraTela.class);
	        	segundoNome = (EditText) findViewById(R.id.editTextSegundoNome);
	        	
				i.putExtra("segundooNomeShow", segundoNome.getText().toString());
				i.putExtra("primeiroNomeShow", priNome);
				
	        	startActivity(i);
			}
		});
	     
	}

	
	
}
