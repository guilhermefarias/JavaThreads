package entity;
//É apenas uma classe que será usada no exemplo
public class Conta {
	int saldo;

	public void setSaldo(int saldo){
		this.saldo = saldo;
	}
	public int getSaldo(){
		return saldo;
	}
	public void debitar(int valor){
		int saldoAtual = saldo - valor;
		this.saldo = saldoAtual;
	}
	public void creditar(int valor){
		int saldoAtual = saldo + valor;
		this.saldo = saldoAtual;
	}
	public Conta(int saldo){
		this.saldo = saldo;
	}
}
