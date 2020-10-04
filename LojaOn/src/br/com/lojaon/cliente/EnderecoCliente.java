package br.com.lojaon.cliente;

public class EnderecoCliente {
	private String endereco;
	private String numero;
	private String complemento;
	private String cidade;
	private String estado;
	private String cep;

	public EnderecoCliente(String endereco, String numero, String complemento, String cidade, String cep) {
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
