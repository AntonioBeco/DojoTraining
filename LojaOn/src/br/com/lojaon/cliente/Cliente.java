package br.com.lojaon.cliente;

import br.com.lojaon.autenticavel.Autenticacao;

public class Cliente {
	private String nome;
	private String cpf;
	private String dn;
	private String email;
	private double telefone;
	private EnderecoCliente endereco;

	private Autenticacao autenticador;

	//public Cliente(String nome, String dn, String cpf, String email, double telefone) {
		//this.nome = nome;
		//this.cpf = cpf;
		//this.dn = dn;
		//this.email = email;
		//this.telefone = telefone;

	//}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public Autenticacao getAutenticador() {
		return autenticador;
	}

	public void setAutenticador(Autenticacao autenticador) {
		this.autenticador = autenticador;
	}

	public boolean autentica(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setSenha(int i) {
		// TODO Auto-generated method stub
		
	}

	public EnderecoCliente getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoCliente endereco) {
		this.endereco = endereco;
	}

}
