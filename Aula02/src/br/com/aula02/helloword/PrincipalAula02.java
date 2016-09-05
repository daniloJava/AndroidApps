package br.com.aula02.helloword;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalAula02 extends Activity {

	
	/**na hora que a aplicação é inicializada,
	 * tudo é rodado aqui, como se fosse um metodo construtor.
	 * 
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// é o caminho da pasta que abre a tela exibindo a View
		//R é onde está os arquivos de configuração
		setContentView(R.layout.principal);
		
		
		//Recuperando o valor do Botão, somente criando um objeto
		Button botao = (Button) findViewById(R.id.buttonEnter);
		
		//metodo para quando Clicar no botão  sobrescrevendo o metodo da classe abastrata View
		botao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				//Pegando os valores dos inputs.
				EditText txtNome = (EditText) findViewById(R.id.editTextNome);
				EditText txtSobrenome = (EditText) findViewById(R.id.editTextSobrenome);
				//recupera o lugar da saida
				TextView textSaida = (TextView) findViewById(R.id.textViewResult);
				
				//Seta a concatenação
				textSaida.setText(txtNome.getText().toString() +" " + txtSobrenome.getText().toString());
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal_aula02, menu);
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
