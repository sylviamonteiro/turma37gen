package Lista5;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome, endereco, genero, pagamento;
		int idade;

		System.out.println("Digite o nome do cliente: ");
		nome = leia.nextLine();
		System.out.println("Digite o endereço do cliente: ");
		endereco = leia.next();

		System.out.println("Digite a idade do cliente: ");
		idade = leia.nextInt();

		leia.nextLine();
		System.out.println("Cliente se declara: 1- Masculino 2- Feminino 3- Outros");
		genero = leia.nextLine();
		while (true) {
			if (genero.equals("1") || genero.equals("2") | genero.equals("3")) {
				break;
			} else {
				System.out.println("Cliente se declara: 1- Masculino 2- Feminino 3- Outros ");
				genero = leia.nextLine();
			}
		}
		if (genero.equals("1")) {
			genero = "Masculino";
		} else if (genero.equals("2")) {
			genero = "Feminino";
		} else {
			genero = "Outros";
		}
		System.out.println("Digite a forma de pagamento: 1- a vista 2- cartão 3- parcelado");
		pagamento = leia.next();
		while (true) {
			if (pagamento.equals("1") || pagamento.equals("2") || pagamento.equals("3")) {
				break;
			} else
				System.out.println("Digite a forma de pagamento: 1- a vista 2- cartão 3- parcelado");
			pagamento = leia.next();
		}
		if (pagamento.equals("1")) {
			pagamento = "a vista";
		} else if (pagamento.equals("2")) {
			pagamento = "cartão";
		} else {
			pagamento = "parcelado";
		}
		Cliente cliente = new Cliente(nome, endereco, idade, genero, pagamento);
		System.out.println(cliente.toString());
		leia.close();
	}

}
