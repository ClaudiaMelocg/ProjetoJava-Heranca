package entities;

public class ContaPoupancaBonus  extends ContaPoupanca{
	
	
	
	
	@Override
	public final void saque(double valor) {
		if(valor < saldo) {
		saldo -= valor + 2.0;
		}
	}
	

}
