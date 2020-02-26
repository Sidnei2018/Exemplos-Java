package condicao.com.sidnei;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// numeros pares e impares

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número!");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Número Par!");
		} else {
			System.out.println("Número Ímpar!");
		}

		sc.close();

	}

}
