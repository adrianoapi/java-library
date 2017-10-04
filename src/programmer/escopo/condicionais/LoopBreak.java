package programmer.escopo.condicionais;

import java.util.Scanner;

public class LoopBreak {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um número:");
		int x = scan.nextInt();

		System.out.println("Insira um limite:");
		int limit = scan.nextInt();

		for (int i = x; i <= limit; i++) {

			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
			}

		}

		scan.close();

	}

}
