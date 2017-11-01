package programer.escopo.vetores;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char[][] jogoVelha = new char[3][3];

		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");

		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;

		while (!ganhou) {

			// jogador 1
			if (jogada % 2 == 1) {
				System.out.println("Vez do jogador 1, escolha linha e coluna 1 à 3:");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 2, escolha linha e coluna 1 à 3:");
				sinal = 'O';
			}

			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Entre com a linha (1, 2 ou 3):");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				}else{
					System.out.println("Entrada inválida");
				}
			}

		}

	}

}
