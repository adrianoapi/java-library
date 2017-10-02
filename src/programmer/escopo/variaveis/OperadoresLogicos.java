package programmer.escopo.variaveis;

public class OperadoresLogicos {

	public static void main(String[] args) {

		int x = 1;
		int y = 2;
		
		boolean resultado1 = (x == 1) && (y == 2);
		System.out.println("valor x é 1 AND valor y é 2 => resultado: " + resultado1);
		
		boolean resultado2 = (x == 1) || (y == 2);
		System.out.println("valor x é 1 AND valor y é 2 => resultado: " + resultado2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && falso);

	}

}
