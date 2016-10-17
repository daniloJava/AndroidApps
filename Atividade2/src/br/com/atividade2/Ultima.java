package br.com.atividade2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import br.com.atividade2.modelo.Contato;

public class Ultima extends Activity {

	private Intent intent;
	private TextView txtNome;
	private TextView txtEmail;
	private TextView txtTelefone;
	private Button btnInicial;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ultima);
		
		intent = getIntent(); 
		Contato contato = (Contato) intent.getSerializableExtra("Contato");
		
		txtNome = (TextView) findViewById(R.id.txtResultadoNome);
		txtEmail = (TextView) findViewById(R.id.txtResultadoEmail);
		txtTelefone = (TextView) findViewById(R.id.txtResultadoTelefone);
		
		txtNome.setText(contato.getNome());
		txtEmail.setText(contato.geteMail());
		txtTelefone.setText(contato.getTelefone());
	
		btnInicial = (Button) findViewById(R.id.btnInicial);
		
		btnInicial.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Ultima.this, Tela1.class);
				startActivity(intent);
			}
		});
		
	}
	

}
