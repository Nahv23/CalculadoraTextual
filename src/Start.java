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

				switch (optionSelected) {
					case 1:
						System.out.println("1");
						break;
					case 2:
						System.out.println("2");
						break;
					case 3:
						System.out.println("3");
						break;
					case 4:
						System.out.println("4");
						break;
					case 5:
						System.out.println("5");
						break;
					case 6:
						System.out.println("6");
						break;
					case 7:
						System.out.println("7");
						break;
					case 8:
						System.out.println("8");
						break;
					case 0:
						System.out.println("bye");
						break;
					default:
						System.out.println("Por favor, selecciona una de las siguientes opciones");
						break;
				}

			} while (optionSelected != 0);

		} finally {
			reader.close();
		}

	}

}
