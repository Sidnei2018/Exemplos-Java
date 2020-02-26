package atribuicao.com.sidnei;

import java.util.Locale;
import java.util.Scanner;

public class Telefonia {

	public static void main(String[] args) {
		// cobranca de ligacoes telefonicas

		int minutos;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de minutos utilizados:");
		minutos = sc.nextInt();

		double conta = 50.0;
		// se os minutos excederem 100 multiplica-se por 2 o excedente
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2.0;
		}

		System.out.printf("Valor a pagar é: R$ %.2f%n", conta);

		sc.close();

	}

}
