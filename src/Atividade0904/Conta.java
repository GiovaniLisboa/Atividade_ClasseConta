package Atividade0904;

public class Conta {
	private String titular;
	private int cpf;
	private int saldo;

	public Conta() {
		titular = " ";
		cpf = 0;
		saldo = 0;
	}
	
	public Conta(String t_temp, int c_temp, int s_temp) {
		titular = t_temp;
		cpf = c_temp;
		saldo = s_temp;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String t_temp) {
		titular = t_temp;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int c_temp) {
		cpf = c_temp;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int s_temp) {
		saldo = s_temp;
	}

	public void depositar (int dep) {
		saldo += dep;
	}
	
	public void sacar (int sac) {
		saldo -= sac;
	}
}