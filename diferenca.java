package java.com.sidnei;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, C, D, dif;

		System.out.println("Digite um n�mero: ");
		A = sc.nextInt();

		System.out.println("Digite um segundo n�mero: ");
		B = sc.nextInt();

		System.out.println("Digite um terceiro n�mero: ");
		C = sc.nextInt();

		System.out.println("Digite um quarto n�mero: ");
		D = sc.nextInt();

		dif = (A * B - C * D);

		System.out.println("A diferen�a �: " + dif);

		sc.close();

	}

}
