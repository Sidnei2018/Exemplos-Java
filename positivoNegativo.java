package condicao.com.sidnei;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		// numeros negativos ou nao
		
		int num;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero!");
		num = sc.nextInt();

		if (num >= 0) {
			System.out.println("N�mero positivo!");
		} else if(num < 0) {
			System.out.println("N�mero negativo!");
		}

		sc.close();

	}

}
