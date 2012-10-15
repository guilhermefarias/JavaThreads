package thread;

import java.util.Scanner;

import entity.Conta;

public class ThreadAtualizaSaldo extends Thread{ 
	public static final Scanner s = new Scanner(System.in);
	Conta acc;
	int valor;
	
	public ThreadAtualizaSaldo (Conta acc, int valor){
		this.acc = acc;
		this.valor = valor;
	}
    public void run() {    	
        while(acc != null) {
        		acc.creditar(valor);
            try {
            	System.out.println("Saldo Atual: " + acc.getSaldo());
            	Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}