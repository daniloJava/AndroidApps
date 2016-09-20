package com.example.aulaa04;

import com.example.aulaa04.calculadora.Calcular;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Calcular calc = new Calcular();
		Button botaoSoma = (Button) findViewById(R.id.bntSoma);
		Button botaoSubtrair = (Button) findViewById(R.id.bntSubtrai);
		final Button botaoDividir = (Button) findViewById(R.id.bntDividir);
		Button botaoMultiplicar = (Button) findViewById(R.id.bntMultiplica);
		TextView va = (TextView) botaoDividir.getText();
		final EditText result = (EditText) findViewById(R.id.TextViewResult);
		botaoSoma.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TextView operador = (TextView) findViewById(R.id.textViewOperador);
				operador.setText((CharSequence) botaoDividir.getText());
				EditText valor1 = (EditText) findViewById(R.id.editText1);
				EditText valor2 = (EditText) findViewById(R.id.editText2);
				
				result.setText(calc.somar(valor1.toString(), valor2.toString()));
				
			}
		});
		
	}

	
	
}
