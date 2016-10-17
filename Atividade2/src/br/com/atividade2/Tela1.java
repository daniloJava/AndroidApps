package br.com.atividade2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import br.com.atividade2.modelo.Contato;

public class Tela1 extends Activity {

	private Button btnProximo;
	private EditText editText;
	private Contato contato;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);
		
		
		btnProximo = (Button) findViewById(R.id.btnProximoTela1);
		editText = (EditText) findViewById(R.id.idNome);
		
		
		btnProximo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				contato = new Contato();
				contato.setNome(editText.getText().toString());
				Intent intent = new Intent(Tela1.this, Tela2.class);
				intent.putExtra("Contato", contato);
				startActivity(intent);
				
			}
		});
		
		
	}



}
