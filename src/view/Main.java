package view;
//Dupla: Guilherme Farias e Iuri Mattos
import java.util.Scanner;
import entity.Conta;
import thread.ThreadAtualizaSaldo;
import thread.ThreadMostraHoras;

public class Main {
	public static final Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int valor;
		System.out.println("Qual o valor inicial da sua conta?");
		valor = s.nextInt();
		Conta acc = new Conta(valor);
		System.out.println("Qual será o valor creditado por segundo em sua conta?");
		valor = s.nextInt();
		ThreadAtualizaSaldo atualizaSaldo = new ThreadAtualizaSaldo(acc,valor);
		ThreadMostraHoras horaAtual = new ThreadMostraHoras(1);
		atualizaSaldo.start();
		horaAtual.start();
	}
}
