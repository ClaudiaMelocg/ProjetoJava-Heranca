package aplicacao;

import entities.Conta;
import entities.ContaJuridica;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		
		Conta conta = new Conta(1001, "Alex", 1000.0);
		conta.saque(200.0);
		
		System.out.println(conta.getSaldo());
		
		Conta conta1 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
		conta1.saca(200.0);
		System.out.println(conta1.getSaldo());
		
		
		
		
		
		Conta  contaJur = new ContaJuridica(1007, "Joao", 1000.0, 500.00);
		contaJur.saque(200.0);
		
		System.out.println(contaJur.getSaldo());
		
		//UPCASTING
		
		Conta conta01 = contaJur;
		Conta conta02 =  new ContaJuridica(1003, "Bob", 0.0, 200.0);
		Conta conta03 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		ContaJuridica conta04 = (ContaJuridica)conta02;
		conta04.emprestimo(100);
		
		if(conta03 instanceof ContaJuridica) {
			ContaJuridica conta05 = (ContaJuridica) conta03;
			conta05.emprestimo(200.0);
		}
		
		if( conta03 instanceof ContaPoupanca) {
			ContaPoupanca conta05 = (ContaPoupanca) conta03;
			conta05.updateSaldo();
			System.out.println("Update!!");
		}
		
		
		
		

	}

}
