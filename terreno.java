package java.com.sidnei;

import java.util.Locale;
import java.util.Scanner;

public class terreno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados de largura,comprimento e metro quadrado!");

		// declarando variaveis
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		// formatando casas decimais
		System.out.printf("Area = %.2f%n ", area);
		System.out.printf("Preco = %.2f%n ", preco);

		sc.close();

	}

}
