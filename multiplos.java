package condicoes.com.sidnei;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		// numeros multiplos

		int num1, num2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número!");
		num1 = sc.nextInt();

		System.out.println("Digite um segundo número!");
		num2 = sc.nextInt();

		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}

		sc.close();

	}

}
