package com.example.aulaa04.calculadora;

public class Calcular {

	
	public String somar(String valor1, String valor2) {
		double result = converterDouble(valor1) + converterDouble(valor2);
		return converterString(result);
	}

	public String subtrair(String valor1, String valor2) {
		double result = converterDouble(valor1) - converterDouble(valor2);
		return converterString(result);
	}

	public String multiplicar(String valor1, String valor2) {
		double result = converterDouble(valor1) * converterDouble(valor2);
		return converterString(result);
	}

	public String dividir(String valor1, String valor2) {
		double result = converterDouble(valor1) / converterDouble(valor2);
		return converterString(result);
	}

	private double converterDouble(String valor1) {
		return Double.parseDouble(valor1);
	}

	private String converterString(double valor1) {
		return String.valueOf(valor1);
	}
}
