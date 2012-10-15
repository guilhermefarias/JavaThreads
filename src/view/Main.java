package view;
import java.util.Scanner;
import entity.Conta;
import thread.ThreadAtualizaSaldo;
import thread.ThreadMostraHoras;

/*

Este um exemplo bem simples do uso de Threads em Java
Este programa utiliza duas threads para fazer tarefas distintas em "pararelo"
Uma thread é responsável por atualizar o valor da conta 
e a outra é responsável por ficar exibindo a hora atual do sistema na tela.

*/


public class Main {
	public static final Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int valor;
		System.out.println("Qual o valor inicial da sua conta?");
		valor = s.nextInt();
		Conta acc = new Conta(valor);
		System.out.println("Qual será o valor creditado por segundo em sua conta?");
		valor = s.nextInt();
		//Aqui eu crio uma das minhas treads, que será responsável por atualizar o valor
		ThreadAtualizaSaldo atualizaSaldo = new ThreadAtualizaSaldo(acc,valor);
		//Agora estou criando a segunda thread que vai ficar exibindo a hora na tela
		ThreadMostraHoras horaAtual = new ThreadMostraHoras(1);

		//Dando start nas duas threads
		atualizaSaldo.start();
		horaAtual.start();
	}
}
