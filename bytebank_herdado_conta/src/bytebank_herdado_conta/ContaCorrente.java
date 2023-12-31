package bytebank_herdado_conta;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		super.saca(valor + 0.2);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}


}
