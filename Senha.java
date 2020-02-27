package repeticao.com.sidnei;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		// Senha de sistema

		int senha = 2002;
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a senha:");
		num = sc.nextInt();

		while (num != senha) {
			System.out.println("Senha Inválida!");
			num = sc.nextInt();
		}

		System.out.println("Senha correta!" + " Seja Bem-Vindo!");

		sc.close();
	}

}
