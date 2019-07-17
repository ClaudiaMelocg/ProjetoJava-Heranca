package entities;

public class ContaJuridica extends Conta{
	
	private Double limiteEspecial;
	
	public ContaJuridica() {
		super();
		
	}

	public ContaJuridica(Integer numero, String titular, Double saldo, Double limiteEspecial) {
		super(numero, titular, saldo);
		this.limiteEspecial = limiteEspecial;
	}

	public Double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(Double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	
	public void emprestimo(double valor) {
		if(valor <= limiteEspecial) {
		saldo += valor - 10.0;
		}
	}
	
	
	@Override
	public void saque(double valor) {
		super.saque(valor);
		saldo -= 2.0;
		
		}
	}
	
	
	

	
	

