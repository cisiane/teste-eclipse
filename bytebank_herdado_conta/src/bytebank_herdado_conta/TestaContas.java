package bytebank_herdado_conta;

public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(200);
		cc.saca(80);
		
		ContaCorrente cc1 = new ContaCorrente(112, 112);
		cc1.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(300);
		
		cc.transfere(50, cp);
		cc.transfere(30, cc1);
		
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		System.out.println("Saldo CC1: " + cc1.getSaldo());

	}

}
