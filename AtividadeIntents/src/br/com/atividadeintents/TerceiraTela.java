package br.com.atividadeintents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class TerceiraTela extends Activity {

	TextView resul;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_terceira_tela);
		
		Intent it = getIntent();
		Bundle params = it.getExtras();
		
		
		resul = (TextView) findViewById(R.id.txtResultado);
		resul.setText(params.getString("primeiroNomeShow") + " "+ params.getString("segundooNomeShow"));
		
	}

}
