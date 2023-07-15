package bytebank_herdado_conta;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 1420);
		cc.deposita(400);
		
		SeguroVida sv = new SeguroVida();
		
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println("Impostos CC: " + ci.getTotalImposto());

	}

}
