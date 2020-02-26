package java.com.sidnei;

public class Produtos {

	public static void main(String[] args) {
		// declarando as variáveis

		String produto1 = "Computador";
		String produto2 = "Mesa de escritório";

		int idade = 30;
		int codigo = 5290;
		char genero = 'E';

		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.23456700;

		// imprimindo na tela com println

		System.out.println(produto1 + ":" + " o preço é R$ " + preco1);
		System.out.println(produto2 + ":" + " o preço é R$ " + preco2 + " e sua medida é de: " + medida + " metros");
		System.out.println(produto1 + " possui a idade de " + idade + " anos" + " e seu código é: " + codigo);
		System.out.println("O gênero dos produtos é: " + genero);

	}

}
