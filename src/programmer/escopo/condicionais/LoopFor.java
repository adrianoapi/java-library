package programmer.escopo.condicionais;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("valor de i é: " + i);
		}

		System.out.println("\n");

		for (int i = 5; i > 0; i--) {
			System.out.println("valor de i é: " + i);
		}

		for (int i = 0, j = 10; i <= j; i++, j--) {
			System.out.println("i é: " + i + "; j é:" + j);
		}

		int count = 0;
		for (; count < 10;) {
			System.out.println("valor de count é: " + count);
			count += 2;
		}

		int soma = 0;
		for (int i = 1; i < 5; soma += i++)			;
		System.out.println("valor da soma: " + soma);

	}

}
