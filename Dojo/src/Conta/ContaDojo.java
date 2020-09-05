package Conta;

public class ContaDojo {

	private double saldo;
	private int agencia;
	private int numero;
	private ClienteDojo titular;

	public ContaDojo(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	public void setAgencia(int agencia) {
		if (agencia == 24) {
			System.out.println("agencia não permitida");
			return;
		}
		this.agencia = agencia;
	}

	// public void setAgencia(int agencia){
	// this.agencia = agencia;
	// }

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return this.saldo;

	}

	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {

			System.out.println("Saldo Insuficiente, seu saldo é de " + saldo + " vc esta tentado sacar " + valor);
			return false;
		}
	}

	public ClienteDojo getTitular() {
		return titular;
	}

	public void setTitular(ClienteDojo titular) {
		this.titular = titular;
	}
}
