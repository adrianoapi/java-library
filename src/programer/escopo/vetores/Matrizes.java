package programer.escopo.vetores;

public class Matrizes {

	public static void main(String[] args) {

		// declarando vetor em linha
		double[] alunoX = { 10, 5, 7, 4 };
		double[][] alunoY = { { 2, 9, 8, 4 }, { 7, 8, 2, 4 } };
		
		/*
		 * System.out.println("\nAlunoX\n"); for (int i = 0; i < alunoX.length;
		 * i++) { System.out.print(alunoX[i]+ " - "); }
		 */

		/*
		 * System.out.println("\nAlunoY\n"); for (int i = 0; i < alunoY.length;
		 * i++) { for (int j = 0; j < alunoY[i].length; j++) {
		 * System.out.print(alunoY[i][j] + " - "); } System.out.println("\n"); }
		 */

		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		for (int i = 0; i < notasAlunos.length; i++) {
			// System.out.println(notasAlunos[i]);
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println("\n");
		}

		notasAlunos[2][3] = 9.5;
		System.out.print("\n Atualizando nota \n");
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println("\n");
		}

		System.out.print("\n Média de notas \n");
		double soma;
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}

			System.out.print("Média do aluno " + i + " é: " + (soma / 4));
			System.out.print("\n");
		}

	}

}
