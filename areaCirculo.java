package java.com.sidnei;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do raio: ");

		double R, A, pi = 3.14159;
		R = sc.nextDouble();

		A = pi * R * R;

		System.out.printf("O valor da área é: %.4f%n ", A);

		sc.close();

	}

}
