package java.com.sidnei;

public class Produtos {

	public static void main(String[] args) {
		// declarando as vari�veis

		String produto1 = "Computador";
		String produto2 = "Mesa de escrit�rio";

		int idade = 30;
		int codigo = 5290;
		char genero = 'E';

		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.23456700;

		// imprimindo na tela com println

		System.out.println(produto1 + ":" + " o pre�o � R$ " + preco1);
		System.out.println(produto2 + ":" + " o pre�o � R$ " + preco2 + " e sua medida � de: " + medida + " metros");
		System.out.println(produto1 + " possui a idade de " + idade + " anos" + " e seu c�digo �: " + codigo);
		System.out.println("O g�nero dos produtos �: " + genero);

	}

}
