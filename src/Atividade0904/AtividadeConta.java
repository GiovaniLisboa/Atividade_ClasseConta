package Atividade0904;

public class AtividadeConta {
	public static void main (String[] args) {

		//Criar primeira conta
		System.out.println("CONTA 1");
		Conta n1 = new Conta("AAA", 45645, 100);
		
		System.out.println("\nConta criada com exito.");
		System.out.println("Titular: "+n1.getTitular());
		System.out.println("CPF: "+n1.getCpf());
		System.out.println("Saldo: "+n1.getSaldo());

		//Criar segunda conta
		System.out.println("\nCONTA 2");
		Conta n2 = new Conta("BBB", 67655, 200);

		System.out.println("\nConta criada com exito.");
		System.out.println("Titular: "+n2.getTitular());
		System.out.println("CPF: "+n2.getCpf());
		System.out.println("Saldo: "+n2.getSaldo());

		//Criar terceira conta
		System.out.println("\nCONTA 3");
		Conta n3 = new Conta("CCC", 65994, 300);
		
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
