package condicoes.com.sidnei;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		// numeros multiplos

		int num1, num2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero!");
		num1 = sc.nextInt();

		System.out.println("Digite um segundo n�mero!");
		num2 = sc.nextInt();

		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("S�o m�ltiplos");
		} else {
			System.out.println("N�o s�o m�ltiplos");
		}

		sc.close();

	}

}
