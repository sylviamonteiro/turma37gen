package Lista5;

import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String modelo, fabricante, companhia;
		int quantidadePassageiros, preco;

		System.out.println("Digite o modelo do avi�o: ");
		modelo = leia.next();

		System.out.println("Digite o modelo do avi�o: ");
		fabricante = leia.next();

		System.out.println("Digite a companhia do avi�o: ");
		companhia = leia.next();

		System.out.println("Digite a quantidade de passageiros do avi�o: ");
		quantidadePassageiros = leia.nextInt();

		System.out.println("Digite o pre�o do avi�o: ");
		preco = leia.nextInt();

		Aviao aviao = new Aviao(modelo, fabricante, companhia, quantidadePassageiros, preco);
		System.out.println(aviao.toString());

		leia.close();
	}

}
