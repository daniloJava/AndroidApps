package br.com.atividadeintents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
	
	private Button btnAvanca;
	private Button btnVoltar = null;
	private EditText primeiroNome;
//	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        
        btnAvanca  = (Button) findViewById(R.id.btnAvancar);
        btnVoltar  = (Button) findViewById(R.id.btnVoltar);
        
        
        btnAvanca.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

        	primeiroNome = (EditText) findViewById(R.id.editTextPrimeiroNome);
//				i.putExtra("primeiroNomeShow", primeiroNome.toString());
//				btnClik();
				
			}

			
		});
        receberDados();
    
    }

	public void receberDados() {
		Intent intent = getIntent();
		
		String priNome = intent.getStringExtra("primeiroNomeShow");
		primeiroNome.setText(priNome);
		
	}
	
//	private void btnClik() {
//		// TODO Auto-generated method stub
//		Intent i = new Intent(this, SegundaTela.class);
//		startActivity(i);
//		
//	}


}
