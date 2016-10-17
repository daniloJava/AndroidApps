package br.com.atividade2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import br.com.atividade2.modelo.Contato;

public class Tela2 extends Activity {

	private Button btnProximo;
	private EditText editText;
	private Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela2);
		
		btnProximo = (Button) findViewById(R.id.btnProximoTela2);
		editText = (EditText) findViewById(R.id.idEmail);
		
		intent = getIntent(); 
		
		btnProximo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Contato contato = (Contato) intent.getSerializableExtra("Contato");
				contato.seteMail(editText.getText().toString());
				Intent intent = new Intent(Tela2.this, Tela3.class);
				intent.putExtra("Contato", contato);
				startActivity(intent);
			}
		});
		
	}

	
}
