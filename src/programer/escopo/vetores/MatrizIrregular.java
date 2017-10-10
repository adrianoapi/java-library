package programer.escopo.vetores;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o número de pessoas que serão entrevistadas:");
		int numEntrevistas = scan.nextInt();

		// Define o tamanho do array
		String[][] nomesFilhos = new String[numEntrevistas][];

		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos");
			int qtdFilhos = scan.nextInt();

			// Define a qtd de filhos no vetor atual
			nomesFilhos[i] = new String[qtdFilhos];

			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho " + (j + 1));
				nomesFilhos[i][j] = scan.next();
			}

		}

		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa " + i + " tem " + nomesFilhos.length + "filhos");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Filhos " + nomesFilhos[i][j]);
			}
		}

	}

}
