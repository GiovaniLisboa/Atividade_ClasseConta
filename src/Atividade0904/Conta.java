package Atividade0904;

import java.util.Date;

public class Conta {
	private String titular;
	private int cpf;
	private int saldo;
	private String operacao;
	private Date dataUltimaOperacao;
	private int identificador;

	public Conta() {
		titular = " ";
		cpf = 0;
		saldo = 0;
		operacao = " ";
	}
	
	public Conta(int s_temp) {
		titular = " ";
		cpf = 0;
		saldo = s_temp;
		operacao = " ";
	}
	
	public Conta(String t_temp, int c_temp, int s_temp) {
		titular = t_temp;
		cpf = c_temp;
		saldo = s_temp;
		operacao = " ";
	}

	public int getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(int i_temp) {
		identificador = i_temp;
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
		this.setOperacao("deposito");
		this.setDataOperacao();
	}
	
	public boolean sacar (int sac) {
        if (autorizar(sac)) {
        	saldo -= sac;
    		this.setOperacao("saque");
    		this.setDataOperacao();
    		return true;
        }	else {
        		System.out.println("Nao autorizado.");
        		return false;
        	}
	}
	
    public String toString(){
        return ("Nome: " + getTitular() + "\nCPF: "+ getCpf() + "\nSaldo:" + getSaldo());
    }
    
    public boolean transferir (Conta co_temp, int transf){
    	if (autorizar(transf)) {
    		this.sacar(transf);
            co_temp.depositar(transf);
            this.setOperacao("transferencia");
            this.setDataOperacao();
            return true;
        }	else {
        		System.out.println("Nao autorizado.");
        		return false;
        	}
    }
    
    private boolean autorizar (int valor) {
        if(saldo>=valor){
            return true;
        }	else {
        		return false;
        	}
    }
    
    public void setOperacao (String op) {
    	operacao = op;
    }
    
    public String getOperacao () {
    	return operacao;
    }
    
    public void ultimaOperacao(){
    	System.out.println("\nSua ultima operacao foi um(a) " + this.getOperacao());
    }
    
    public void setDataOperacao () {
    	dataUltimaOperacao = new Date();
    }
    
    public Date getDataOperacao () {
    	return dataUltimaOperacao;
    }
    
    public void dataUltimaOperacao(){
    	System.out.println("\nSua ultima operacao foi em " + this.getDataOperacao());
    }
}

