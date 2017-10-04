package programer.escopo.vetores;

public class Arrays {

	public static void main(String[] args) {

		// double tempodDia001 = 31.3;
		// double tempodDia002 = 32;
		// double tempodDia003 = 30;
		// double tempodDia004 = 33;
		// double tempodDia005 = 32.5;

		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 30;
		temperaturas[3] = 33;
		temperaturas[4] = 32.5;

		System.out.println("A temperadura do dia 1 é: " + temperaturas[2]);
		System.out.println("Tamanho do array é: " + temperaturas.length);

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura " + (i + 1) + " é: " + temperaturas[i]);
		}

	}

}
