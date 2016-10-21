package br.com.caelum.blog.jenkins;

public class Imposto {

	public Imposto() {
	}

	public double calcula(Orcamento orcamento) {
		System.out.println("teste");
		return orcamento.getValor() * 0.1;
	}

	public double calculaIR(Orcamento orcamento) {
		System.out.println("IR calculado");
		return orcamento.getValor() * 0.3;
	}

	public String getTipo() {
		return "Imposto de Renda";
	}

}
