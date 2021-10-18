package Lista4;

import java.util.Locale;
import java.util.Scanner;

/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2
*/
public class exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int matrizA[][] = new int[4][6];
		int matrizB[][] = new int[4][6];
		int matrizC[][] = new int[4][6];
		int matrizD[][] = new int[4][6];
		int linha = 0, coluna = 0;

		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 6; coluna++) {
				System.out.print("Escreva o valor da linha " + linha + " e coluna " + coluna);
				matrizA[linha][coluna] = leia.nextInt();
			}

		}
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 6; coluna++) {
				System.out.print("Escreva o valor da linha " + linha + " e coluna " + coluna);
				matrizB[linha][coluna] = leia.nextInt();
			}
		}
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 6; coluna++) {
				matrizC[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
			}
		}
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 6; coluna++) {
				matrizD[linha][coluna] = matrizA[linha][coluna] - matrizB[linha][coluna];
			}
		}
		System.out.println("Matriz A");
		for (linha = 0; linha < 4; linha++) {
			System.out.println();
			for (coluna = 0; coluna < 6; coluna++) {
				System.out.print(matrizA[linha][coluna] + "\t");
			}

		}
		System.out.println("Matriz B");
		for (linha = 0; linha < 4; linha++) {
			System.out.println();
			for (coluna = 0; coluna < 6; coluna++) {
				System.out.print(matrizB[linha][coluna] + "\t");
			}
		}
		System.out.println("Matriz C");
		for (linha = 0; linha < 4; linha++) {
			System.out.println();
			for (coluna = 0; coluna < 6; coluna++) {
				System.out.print(matrizC[linha][coluna] + "\t");
			}
		}
		System.out.println("Matriz D");
		for (linha = 0; linha < 4; linha++) {
			System.out.println();
			for (coluna = 0; coluna < 6; coluna++) {
				System.out.print(matrizD[linha][coluna] + "\t");
			}
		}
	}
}