package dio;

public class Main {

	public static void main(String[] args) {

		Cliente nelson = new Cliente();

		Cliente veruska = new Cliente();

		nelson.setNome("Nelson");
		veruska.setNome("Veruska");

		Conta cc = new ContaCorrente(nelson);
		Conta cp = new ContaPoupanca(veruska);

		cc.depositar(100);
		cc.transferir(cp, 50);

		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
