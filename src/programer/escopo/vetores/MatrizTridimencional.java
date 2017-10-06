package programer.escopo.vetores;

public class MatrizTridimencional {

	public static void main(String[] args) {

		int[][][] matrizTridimencional = new int[3][3][3];

		for (int i = 0; i < matrizTridimencional.length; i++) {
			for (int j = 0; j < matrizTridimencional[i].length; j++) {
				for (int k = 0; k < matrizTridimencional[i][j].length; k++) {
					matrizTridimencional[i][j][k] = i + j + k;
					System.out.println("i = " + i + ", j = " + j + ", k = " + k);
				}
			}
		}

		int impares = 0;
		int pares = 0;
		int somaImpares = 0;
		int somaPares = 0;
		for (int i = 0; i < matrizTridimencional.length; i++) {
			for (int j = 0; j < matrizTridimencional[i].length; j++) {
				for (int k = 0; k < matrizTridimencional[i][j].length; k++) {

					if (matrizTridimencional[i][j][k] % 2 == 0) {
						somaPares += matrizTridimencional[i][j][k];
						impares += 1;
					} else {
						somaImpares += matrizTridimencional[i][j][k];
						pares += 1;
					}

				}
			}
		}

		System.out.println("\nQuantidade de:");
		System.out.println("Ímpares: " + impares + ", Pares: " + pares + ", Total: " + (impares + pares));

		System.out.println("\nA doma de:");
		System.out
				.println("Ímpares: " + somaImpares + ", Pares: " + somaPares + ", Total: " + (somaImpares + somaPares));

	}

}
