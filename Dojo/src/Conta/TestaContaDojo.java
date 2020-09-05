package Conta;

import java.util.ArrayList;
import java.util.List;

//import br.com.bytebank.banco.modelo.Conta;

public class TestaContaDojo {
	public static void main(String args[]) {
		// Recebendo o valor da linha de comando
		// double valor = Double.parseDouble(args[0]);

		// Criando uma nova conta
		// Conta conta = new Conta(333, 212121);
		// conta.setAgencia(3);
		// System.out.println(conta.getAgencia());

		// Usando a conta
		// conta.deposita(valor);
		// conta.saca(33);
		// conta.saca(1550);

		// System.out.println("Saldo atual: "+ conta.saldo);

		ContaDojo c1 = new ContaDojo(014, 212121);
		ClienteDojo conta1 = new ClienteDojo("Antonio Meio Bão", "212.252.254.-52", "24/04/1980");
		c1.setTitular(conta1);
		c1.deposita(3895);

		ContaDojo c2 = new ContaDojo(012, 222598);
		ClienteDojo conta2 = new ClienteDojo("Guilherme Bão", " 356.685.478.95", "31/02/1990");
		c2.setTitular(conta2);
		c2.deposita(5900);

		ContaDojo c3 = new ContaDojo(012, 569872);
		ClienteDojo conta3 = new ClienteDojo("Cristian Bãodemais", "189.259.356.21", "24/07/1980");
		c3.setTitular(conta3);
		c3.deposita(220000);
		
		List<ContaDojo> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		 for (ContaDojo conta : lista) {
             System.out.println(conta);

		//System.out.println(c1 + ", " + c1.getTitular() + c3.getSaldo());

		//System.out.println(c1.getTitular());

	}
	}
}
