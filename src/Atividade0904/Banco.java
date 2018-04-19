package Atividade0904;

import java.util.Random;

public class Banco {
	public static void main (String[] args) {
		Random random = new Random();
		
		int saldoBanco = 0;
		int destino, origem, transf;
		int operacaoSucesso = 0;
		Conta n[] = new Conta[20];
		
		//Criar contas
		for(int i = 0; i <= 20; i++) {
			System.out.println("\nCONTA " + (++i));
			
			int saldo = random.nextInt(10001);
			n[i] = new Conta(saldo);
			
			n[i].setIdentificador(i+1);
			
			
			System.out.println("Conta criada com exito.");
			System.out.println("Conta: "+n[i].getIdentificador());
			System.out.println("Saldo: "+n[i].getSaldo());
			
			saldoBanco += n[i].getSaldo();
			System.out.println("Saldo do banco: "+ saldoBanco);
		}
		
		//Operações
		for(int i = 0; i <= 100; i++) {
			System.out.println("OPERACAO " + (++i));
			
			origem = random.nextInt(20)+1;
			destino = random.nextInt(20)+1;
			if (destino == origem) {
				destino = random.nextInt(20)+1;
			}
			
			transf = random.nextInt(501);
			
			if (n[origem].transferir(n[destino], transf)) {
				operacaoSucesso++;
			};
			
			System.out.println("Conta de origem: "+n[origem].getIdentificador());
			System.out.println("Saldo: "+n[origem].getSaldo());
			System.out.println("Conta de destino: "+n[destino].getIdentificador());
			System.out.println("Saldo: "+n[destino].getSaldo());
			System.out.println("Saldo do banco: "+ saldoBanco);
		}
		System.out.println("Operacoes bem sucedidas: "+ operacaoSucesso);
	}
}
