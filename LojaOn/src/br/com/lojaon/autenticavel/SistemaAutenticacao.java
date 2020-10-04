package br.com.lojaon.autenticavel;

public class SistemaAutenticacao {
	
private int senha = 9999;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Senha autenticada aprovada ");
		} else { System.out.println("Senha incorreta ");
		}
	}

}
