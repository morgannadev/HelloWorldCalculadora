package br.com.calculadora;

public class Calculadora {

	private Double numeroA;
	private Double numeroB;
	private Double resultado;
	
	public Double getNumeroA() {
		return numeroA;
	}
	
	public void setNumeroA(Double numeroA) {
		this.numeroA = numeroA;
	}

	public Double getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(Double numeroB) {
		this.numeroB = numeroB;
	}
	
	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public void somar(Double numeroA, Double numeroB) {
		this.resultado = numeroA + numeroB;
	}
	
	public void multiplicar(Double numeroA, Double numeroB) {
		this.resultado = numeroA * numeroB;
	}
	
	public void subtrair(Double numeroA, Double numeroB) {
		this.resultado = numeroA - numeroB;
	}
	
	public void dividir(Double numeroA, Double numeroB) throws Exception {
		try {
			if(numeroB == 0) {
				throw new Exception("Divisão impossível");
			}
			this.resultado = numeroA / numeroB;
		} catch (Exception e) {			
			System.out.println(e.getMessage());
		}
	}	
}
