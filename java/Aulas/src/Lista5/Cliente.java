package Lista5;

public class Cliente {
	private String nome;
	private String endereco;
	private int idade;
	private String pagamento;
	private String genero;

	public Cliente() {

	}

	public Cliente(String nome, String endereco, int idade, String pagamento, String genero) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.pagamento = pagamento;
		this.genero = genero;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Cliente[Nome=" + nome + ",Endereco=" + endereco + ", Idade=" + idade + ", Genero" + genero
				+ ",Pagamento" + pagamento + "]";
	}

}
