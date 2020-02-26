package java.com.sidnei;

import java.util.Locale;
import java.util.Scanner;

public class HoraTrabalho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
		double valorHora, salario;

		System.out.println("Digite seu número de funcionário: ");
		numero = sc.nextInt();

		System.out.println("Digite suas horas trabalhadas: ");
		horas = sc.nextInt();

		System.out.println("Digite seu salário por hora trabalhada: ");
		valorHora = sc.nextDouble();

		salario = valorHora * horas;

		System.out.printf("Seu número é: " + numero + " e seu salário é: R$ %.2f%n", salario);

		sc.close();

	}

}
