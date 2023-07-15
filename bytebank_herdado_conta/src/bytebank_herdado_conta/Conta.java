package bytebank_herdado_conta;

	public class Conta {

		private int agencia;
		private int numero;
		private Cliente titular;
		private double saldo;
		private static int total;
	
		
	public Conta(int agencia, int numero) {
		Conta.total++;
	    if(agencia < 1) {
	         throw new IllegalArgumentException("Agencia inválida");
	    }
	    if(numero < 1) {
	         throw new IllegalArgumentException("Numero da conta inválido");
	    }
	    this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Nova conta criada.");
	}
		
	public boolean deposita (double valor) {
		if(valor >= 0) {
			this.saldo += valor;
			return true;
		} 
			return false;
	}
	
	public void saca (double valor) throws SaldoInsuficienteException {
		if (saldo < valor) {
			throw new SaldoInsuficienteException("Saque não autorizado. Saldo insuficiente."); 
		}
			this.saldo -= valor;
			
	}
	
	public boolean transfere (double valor, Conta destino) throws SaldoInsuficienteException {
		if(saldo >= valor) {
			//ou => this.saldo -= valor;
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} 
			return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero >= 0) {
			this.numero = numero;
		} else {
			System.out.println("Número inválido.");
		}
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia >= 0) {
			this.agencia = agencia;
		} else {
			System.out.println("Agencia inválida.");
		}
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

	
}

