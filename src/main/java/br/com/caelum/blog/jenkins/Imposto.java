package br.com.caelum.blog.jenkins;

public class Imposto {

	private Orcamento orcamento;

	public Imposto() {
	}

	public Imposto(Orcamento orcamento) {
		this.orcamento = orcamento;
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
