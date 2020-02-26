package java.com.sidnei;

import java.util.Locale;
import java.util.Scanner;

public class Geometria {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// variaveis
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

		System.out.println("Entre com os valores para o cálculo: ");
		// lendo 3 valores
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		// formulas
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;

		System.out.printf("A área do triângulo é : %.3f%n", triangulo);
		System.out.printf("A área do círculo é : %.3f%n", circulo);
		System.out.printf("A área do trapézio é : %.3f%n", trapezio);
		System.out.printf("A área do quadrado é : %.3f%n", quadrado);
		System.out.printf("A área do retângulo é : %.3f%n", retangulo);

		sc.close();

	}

}
