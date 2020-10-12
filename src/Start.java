import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int optionSelected;

		try {
			do {
				System.out.println("_____________________________");
				System.out.println("\nCalculadora de Calculator S.A");
				System.out.println("_____________________________");

				System.out.println("\n\nIntroduzca una opción del menu:");
				System.out.println(" 1. Sumar ");
				System.out.println(" 2. Restar ");
				System.out.println(" 3. Multiplicar ");
				System.out.println(" 4. Dividir ");
				System.out.println(" 5. Resto (modulo) ");
				System.out.println(" 6. Zoodíaco ");
				System.out.println(" 7. Número mayor de 3 números ");
				System.out.println(" 8. Capicua ");
				System.out.println(" 0. Salir");

				System.out.print("\n\nIntroduzca una opción:");

				optionSelected = reader.nextInt();
			} while (optionSelected != 0);

		} finally {
			reader.close();
		}

	}

}
