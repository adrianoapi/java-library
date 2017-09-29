package programmer.escopo.variaveis;

public class LoopControle {

	public static void main(String[] args) {

		int x = 1;
		int y = 100;
		int divisor = 8;

		for (int i = x; x < y; i++) {
			if (i % divisor == 0) {
				System.out.println("Primeiro número divisível por " + divisor + " entre " + x + " e " + y + " é: " + i);
				break;
			}
		}

	}

}
