package condicao.com.sidnei;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		// numeros negativos ou nao
		
		int num;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número!");
		num = sc.nextInt();

		if (num >= 0) {
			System.out.println("Número positivo!");
		} else if(num < 0) {
			System.out.println("Número negativo!");
		}

		sc.close();

	}

}
