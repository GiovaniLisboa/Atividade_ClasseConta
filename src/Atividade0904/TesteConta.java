package Atividade0904;

import java.util.Scanner;

public class TesteConta {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		String titular_;
		int cpf_;
		//int saldo_;

		//Criar primeira conta
		System.out.println("CONTA 1");
		Conta n1 = new Conta();
		
		System.out.print("Insira o nome do titular da conta: ");
		titular_ = scanner.nextLine();
		n1.setTitular(titular_);

		System.out.print("Insira o cpf do titular da conta: ");
		cpf_ = scanner.nextInt();
		n1.setCpf(cpf_);

		//System.out.print("Insira o saldo inicial da conta: ");
		//saldo_ = scanner.nextInt();
		n1.setSaldo(100);

		System.out.println("\nConta criada com exito.");
		System.out.println("Titular: "+n1.getTitular());
		System.out.println("CPF: "+n1.getCpf());
		System.out.println("Saldo: "+n1.getSaldo());

		//Criar segunda conta
		System.out.println("\nCONTA 2");
		Conta n2 = new Conta();
		
		System.out.print("Insira o nome do titular da conta: ");
		//titular_ = scanner.nextLine();
		n2.setTitular(titular_);

		System.out.print("Insira o cpf do titular da conta: ");
		//cpf_ = scanner.nextInt();
		n2.setCpf(cpf_);

		//System.out.print("Insira o saldo inicial da conta: ");
		//saldo_ = scanner.nextInt();
		n2.setSaldo(200);
	
		System.out.println("\nConta criada com exito.");
		System.out.println("Titular: "+n2.getTitular());
		System.out.println("CPF: "+n2.getCpf());
		System.out.println("Saldo: "+n2.getSaldo());

		//Criar terceira conta
		Conta n3 = new Conta();
		System.out.println("\nCONTA 3");
		
		System.out.print("Insira o nome do titular da conta: ");
		titular_ = scanner.nextLine();
		n3.setTitular(titular_);

		System.out.print("Insira o cpf do titular da conta: ");
		cpf_ = scanner.nextInt();
		n3.setCpf(cpf_);

		//System.out.print("Insira o saldo inicial da conta: ");
		//saldo_ = scanner.nextInt();
		n3.setSaldo(300);

		System.out.println("\nConta criada com exito.");
		System.out.println("Titular: "+n3.getTitular());
		System.out.println("CPF: "+n3.getCpf());
		System.out.println("Saldo: "+n3.getSaldo());

		//transferência 1
		n1.sacar(150);
		n2.depositar(150);

		//transferência 2
		n2.sacar(150);
		n3.depositar(150);
		
		System.out.println("\nSaldo (1): "+n1.getSaldo());
		System.out.println("Saldo (2): "+n2.getSaldo());
		System.out.println("Saldo (3): "+n3.getSaldo());
	}
}
