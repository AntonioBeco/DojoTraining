package br.com.lojaon.cliente;

import br.com.lojaon.autenticavel.Autenticavel;
import br.com.lojaon.autenticavel.Administrador;
import br.com.lojaon.autenticavel.*;
import br.com.lojaon.autenticavel.SistemaAutenticacao;

public class TestaCliente extends EnderecoCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		c1.setNome("Antonio Beco");
		c1.setDn("24/04/80");
		c1.setCpf("222.666.654-50");
		c1.setEmail("belobelado@hotmail.com");
		c1.setTelefone(11 - 969696969);
		c1.setSenha(9999);
		boolean autenticou = c1.autentica(9999);

		EnderecoCliente cliente1 = new EnderecoCliente("rua Vitoria ", "215", "ap 42 ", "São Paulo ", "SP ");
		c1.setEndereco(cliente1);

		System.out.println(c1.getNome());
		System.out.println(c1.getDn());
		System.out.println(c1.getCpf());
		System.out.println(c1.getEmail());
		System.out.println(c1.getEndereco());
		System.out.println(autenticou);
	}
}
