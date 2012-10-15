package thread;
import java.util.Scanner;
import entity.Conta;

//Para dizer que esta classe será uma thread, eu dou extends Thread
public class ThreadAtualizaSaldo extends Thread{ 
	public static final Scanner s = new Scanner(System.in);
	Conta acc;
	int valor;
	

    //Declarando um metodo qualquer para ser usado no exemplo
	public ThreadAtualizaSaldo (Conta acc, int valor){
		this.acc = acc;
		this.valor = valor;
	}

    //Toda thread deve ter o metodo RUN, este metodo será executado assim que a thread for iniciada.
    public void run() { 
        //Aqui dentro fica o código que você quiser que seja executado
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