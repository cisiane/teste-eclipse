package bytebank_herdado_conta;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new Conta(123, 4567);
		conta.deposita(200);
		try {
			conta.saca(250);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println("Saldo CC: " + conta.getSaldo());
		
	}

}
