package br.com.caelum.blog.jenkins;
public class Orcamento {

	private double valor;
        private double orcamentoFavoravel;

	public Orcamento(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public double getOrcamentoFavoravel() {
		return this.orcamentoFavoravel;
	}

	public void setOrcamentoFavoravel(double orcamentoFavoravel) {
		this.orcamentoFavoravel = orcamentoFavoravel;
	}

}
