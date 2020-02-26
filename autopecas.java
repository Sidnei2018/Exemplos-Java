package java.com.sidnei;

import java.util.Locale;
import java.util.Scanner;

public class Autopecas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qtd1, qtd2;
		double valor1, valor2, total;

		System.out.println("Digite o código da peça 1: ");
		cod1 = sc.nextInt();

		System.out.println("Digite a quantidade de peças 1: ");
		qtd1 = sc.nextInt();

		System.out.println("Digite o valor unitário da peça 1: ");
		valor1 = sc.nextDouble();

		System.out.println("Digite o código da peça 2: ");
		cod2 = sc.nextInt();

		System.out.println("Digite a quantidade de peças 2: ");
		qtd2 = sc.nextInt();

		System.out.println("Digite o valor unitário da peça 2: ");
		valor2 = sc.nextDouble();

		total = valor1 * qtd1 + valor2 * qtd2;

		System.out.printf("O total a pagar é: R$ %.2f%n", total);

		sc.close();

	}

}
