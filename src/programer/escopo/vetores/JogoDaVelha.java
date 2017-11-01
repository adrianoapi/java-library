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
				System.out.println("Vez do jogador 1, escolha linha e coluna 1 � 3:");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 2, escolha linha e coluna 1 � 3:");
				sinal = 'O';
			}

			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Entre com a linha (1, 2 ou 3):");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada inv�lida, tente novamente!");
				}
			}

			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Entre com a coluna (1, 2 ou 3):");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada inv�lida, tente novamente!");
				}
			}

			// corrigindo a posi��o selecionada para ser lida no array,
			// pois come�a em 0
			linha--;
			coluna--;
			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println("Posi��o em uso, tente novamente");
			} else {
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}

			// imprimir tabuleiro
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + "|");
				}
				System.out.print("\n");
			}

			// verifica se tem ganhador
			if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' &&  jogoVelha[0][2] == 'X') // linha 1
					|| (jogoVelha[1][0] == 'X' &&  jogoVelha[1][1] == 'X' &&  jogoVelha[1][2] == 'X') // linha 1 
					|| (jogoVelha[2][0] == 'X' &&  jogoVelha[2][1] == 'X' &&  jogoVelha[2][2] == 'X') // linha 1
					|| (jogoVelha[0][0] == 'X' &&  jogoVelha[1][0] == 'X' &&  jogoVelha[2][0] == 'X') // coluna 2
					|| (jogoVelha[0][1] == 'X' &&  jogoVelha[1][1] == 'X' &&  jogoVelha[2][1] == 'X') // coluna 2
					|| (jogoVelha[0][2] == 'X' &&  jogoVelha[1][2] == 'X' &&  jogoVelha[2][2] == 'X') // coluna 2
					|| (jogoVelha[0][0] == 'X' &&  jogoVelha[1][1] == 'X' &&  jogoVelha[2][2] == 'X') // diagonal
					|| (jogoVelha[2][0] == 'X' &&  jogoVelha[1][1] == 'X' &&  jogoVelha[0][2] == 'X') 
					) {
				ganhou = true;
				System.out.println("Parab�ns, jogador 1 ganhou!");

			}else if((jogoVelha[0][0] == 'O' &&  jogoVelha[0][1] == 'O' &&  jogoVelha[0][2] == 'O') // linha 1
					|| (jogoVelha[1][0] == 'O' &&  jogoVelha[1][1] == 'O' &&  jogoVelha[1][2] == 'O') // linha 1 
					|| (jogoVelha[2][0] == 'O' &&  jogoVelha[2][1] == 'O' &&  jogoVelha[2][2] == 'O') // linha 1
					|| (jogoVelha[0][0] == 'O' &&  jogoVelha[1][0] == 'O' &&  jogoVelha[2][0] == 'O') // coluna 2
					|| (jogoVelha[0][1] == 'O' &&  jogoVelha[1][1] == 'O' &&  jogoVelha[2][1] == 'O') // coluna 2
					|| (jogoVelha[0][2] == 'O' &&  jogoVelha[1][2] == 'O' &&  jogoVelha[2][2] == 'O') // coluna 2
					|| (jogoVelha[0][0] == 'O' &&  jogoVelha[1][1] == 'O' &&  jogoVelha[2][2] == 'O') // diagonal
					|| (jogoVelha[2][0] == 'O' &&  jogoVelha[1][1] == 'O' &&  jogoVelha[0][2] == 'O') 
					){
				ganhou = true;
				System.out.println("Parab�ns, jogador 2 ganhou!");
			}

		}

	}

}
