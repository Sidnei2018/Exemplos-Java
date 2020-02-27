package repeticao.com.sidnei;

import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {
		// utilizando estrutura FOR (para)

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Digite um número:");
		num = sc.nextInt();

		// inicializa variavel soma
		int soma = 0;
		for (int i = 0; i < num; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}

		System.out.println(soma);

		sc.close();

	}

}
