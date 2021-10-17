package Lista5;

public class Aviao {
	private String modelo;
	private String fabricante;
	private String companhia;
	private int quantidadePassageiros;
	private int preco;

	public Aviao(String modelo1, String fabricante1, String companhia1, int quantidadePassageiros1, int preco1) {
		modelo = modelo1;
		fabricante = fabricante1;
		companhia = companhia1;
		quantidadePassageiros = quantidadePassageiros1;
		preco = preco1;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}

	public void setQuantidadePassageiros(int quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Aviao[modelo=" + modelo + ", fabricante=" + fabricante + ", companhia=" + companhia
				+ "quantidadePassageiros=" + quantidadePassageiros + ", preco =" + preco + "]";

	}
}
