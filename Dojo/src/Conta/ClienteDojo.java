package Conta;

public class ClienteDojo {

	private String nome;
	private String cpf;
	private String dn;

	public ClienteDojo(String nome, String dn, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.dn = dn;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDn() {
		return dn;
	}

	public void setDn(String dn) {
		this.dn = dn;
	}

}
