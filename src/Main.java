
public class Main {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");		
		Conta cc = new ContaCorrente(paulo);
		Conta poupanca = new ContaPoupanca(paulo);
		cc.depositar(1000);		
		cc.transferir(500, poupanca);		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();		
			
	}

}
