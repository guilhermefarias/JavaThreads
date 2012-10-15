package thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ThreadMostraHoras extends Thread{ 
	int indice;
	
	public ThreadMostraHoras (int i){
		this.indice = i;
	}
    public void run() {
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