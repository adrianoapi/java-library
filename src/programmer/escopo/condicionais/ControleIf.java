package programmer.escopo.condicionais;

import java.util.Scanner;

public class ControleIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um n�mero: \r");
		int x = scan.nextInt();

		if (x % 2 == 0) {
			System.out.println("O n�mero " + x + " � par");
		}else{
			System.out.println("O n�mero " + x + " � impar");
		}

		scan.close();
	}

}
