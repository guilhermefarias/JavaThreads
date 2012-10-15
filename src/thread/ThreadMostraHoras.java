package thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//Para dizer que esta classe será uma thread, eu dou extends Thread
public class ThreadMostraHoras extends Thread{ 
	int indice;
	
    //Declarando um metodo qualquer para ser usado no exemplo
	public ThreadMostraHoras (int i){
		this.indice = i;
	}

    //Toda thread deve ter o metodo RUN, este metodo será executado assim que a thread for iniciada.
    public void run() {
        //Aqui dentro fica o código que você quiser que seja executado
    	DateFormat formato = new SimpleDateFormat("HH:mm:ss");  
    	
        while(indice != 0) {
            Date date = new Date();  
            String formattedDate = formato.format(date); 
            System.out.println("Hora atual: " + formattedDate);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}