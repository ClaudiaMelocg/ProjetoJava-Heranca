package entities;

public class Conta {
	
	private Integer numero;
	private  String titular;
	protected Double saldo;
	
	public Conta() {
		
	}

	
	
	public Conta(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}



	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public Double getSaldo() {
		return saldo;
	}



	public void saque(double valor) {
		if(valor < saldo) {
		saldo -= valor + 5.0;
		}
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}


	
	
	public boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + ", getNumero()=" + getNumero()
				+ ", getTitular()=" + getTitular() + ", getSaldo()=" + getSaldo() + "]";
	}



	
	
	
	
	
	
	

}
