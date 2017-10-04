package programmer.escopo.condicionais;

import java.util.Scanner;

public class LoopContinue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um número:");
		int x = scan.nextInt();

		System.out.println("Insira um limite:");
		int limit = scan.nextInt();

		for (int i = x; i <= limit; i++) {

			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);

		}

		scan.close();
	}

}
