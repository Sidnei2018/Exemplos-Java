package java.com.sidnei;

import java.util.Locale;
import java.util.Scanner;

public class Autopecas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qtd1, qtd2;
		double valor1, valor2, total;

		System.out.println("Digite o c�digo da pe�a 1: ");
		cod1 = sc.nextInt();

		System.out.println("Digite a quantidade de pe�as 1: ");
		qtd1 = sc.nextInt();

		System.out.println("Digite o valor unit�rio da pe�a 1: ");
		valor1 = sc.nextDouble();

		System.out.println("Digite o c�digo da pe�a 2: ");
		cod2 = sc.nextInt();

		System.out.println("Digite a quantidade de pe�as 2: ");
		qtd2 = sc.nextInt();

		System.out.println("Digite o valor unit�rio da pe�a 2: ");
		valor2 = sc.nextDouble();

		total = valor1 * qtd1 + valor2 * qtd2;

		System.out.printf("O total a pagar �: R$ %.2f%n", total);

		sc.close();

	}

}
