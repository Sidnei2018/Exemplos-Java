package condicao.com.sidnei;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// numeros pares e impares

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero!");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("N�mero Par!");
		} else {
			System.out.println("N�mero �mpar!");
		}

		sc.close();

	}

}
