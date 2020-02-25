package condicoes.com.sidnei;

import java.util.Scanner;

public class duracaoJogo {

	public static void main(String[] args) {
		// calcula duracao de um jogo de futebol

		int horaInicio, horaTermino, duracao;

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a hora de inicio do jogo:");
		horaInicio = sc.nextInt();

		System.out.println("Entre com a hora de término do jogo:");
		horaTermino = sc.nextInt();

		if (horaInicio < horaTermino) {
			duracao = horaTermino - horaInicio;
		} else {
			duracao = 24 - horaInicio + horaTermino;
		}

		System.out.println("O jogo durou " + duracao + " horas!");

		sc.close();

	}

}
