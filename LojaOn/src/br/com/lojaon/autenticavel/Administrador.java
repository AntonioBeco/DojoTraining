package br.com.lojaon.autenticavel;

import br.com.lojaon.cliente.Cliente;

public class Administrador extends Cliente implements Autenticavel {

	private Autenticacao autenticador;

	public Administrador() {
		this.autenticador = new Autenticacao();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
