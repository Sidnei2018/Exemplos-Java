package java.com.sidnei;

import java.util.Locale;
import java.util.Scanner;

public class HoraTrabalho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
		double valorHora, salario;

		System.out.println("Digite seu n�mero de funcion�rio: ");
		numero = sc.nextInt();

		System.out.println("Digite suas horas trabalhadas: ");
		horas = sc.nextInt();

		System.out.println("Digite seu sal�rio por hora trabalhada: ");
		valorHora = sc.nextDouble();

		salario = valorHora * horas;

		System.out.printf("Seu n�mero �: " + numero + " e seu sal�rio �: R$ %.2f%n", salario);

		sc.close();

	}

}
