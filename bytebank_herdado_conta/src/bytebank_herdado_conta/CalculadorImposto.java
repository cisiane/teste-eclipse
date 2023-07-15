package bytebank_herdado_conta;

public class CalculadorImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		totalImposto += valor; //ou somente: totalImposto += t.getValorImposto();
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
