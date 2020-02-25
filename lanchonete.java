package condicoes.com.sidnei;

import java.util.Scanner;

public class lanchonete {

	public static void main(String[] args) {
		// lanchonete

		int codigo, quantidade;
		double valor;

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o código do item: ");
		codigo = sc.nextInt();

		System.out.println("Entre com a quantidade do item: ");
		quantidade = sc.nextInt();

		if (codigo == 0 || quantidade == 0) {
			System.out.println("Digite um valor válido!");
		} else if (codigo == 1) {
			valor = 4.5 * quantidade;
			System.out.println("Item = " + codigo + " Hot-Dog " + " R$ " + valor);
		} else if (codigo == 2) {
			valor = 6.5 * quantidade;
			System.out.println("Item = " + codigo + " Cachorro-Quente " + " R$ " + valor);
		} else if (codigo == 3) {
			valor = 8.2 * quantidade;
			System.out.println("Item = " + codigo + " X-Salada " + " R$ " + valor);
		} else if (codigo == 4) {
			valor = 10.0 * quantidade;
			System.out.println("Item = " + codigo + " X-Bacon " + " R$ " + valor);
		} else if (codigo == 5) {
			valor = 12.0 * quantidade;
			System.out.println("Item = " + codigo + " X-Egg " + " R$ " + valor);

			sc.close();
		}

	}

}
