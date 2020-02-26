package java.com.sidnei;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, C, D, dif;

		System.out.println("Digite um número: ");
		A = sc.nextInt();

		System.out.println("Digite um segundo número: ");
		B = sc.nextInt();

		System.out.println("Digite um terceiro número: ");
		C = sc.nextInt();

		System.out.println("Digite um quarto número: ");
		D = sc.nextInt();

		dif = (A * B - C * D);

		System.out.println("A diferença é: " + dif);

		sc.close();

	}

}
