import java.util.Scanner;


public class Start {
	static Scanner reader = new Scanner(System.in);
	
	public static void printMenu() {
		System.out.println("\n_____________________________");
		System.out.println("\nCalculadora de Calculator S.A");
		System.out.println("_____________________________");

		System.out.println("\n\nIntroduzca una opci�n del menu:");
		System.out.println(" 1. Sumar ");
		System.out.println(" 2. Restar ");
		System.out.println(" 3. Multiplicar ");
		System.out.println(" 4. Dividir ");
		System.out.println(" 5. Resto (modulo) ");
		System.out.println(" 6. Zood�aco ");
		System.out.println(" 7. N�mero mayor de 3 n�meros ");
		System.out.println(" 8. Capicua ");
		System.out.println(" 0. Salir");		
	}
	
	public static void add() {
		float num1;
		float num2;
		
		System.out.print("\nIntroduzca el primer n�mero flotante a sumar: ");
		num1 = reader.nextFloat();
		
		System.out.print("Introduzca el segundo n�mero flotante a sumar: ");
		num2 = reader.nextFloat();
		
		System.out.println("La suma de "+ num1 +" y "+ num2 +" es "+ (num1+num2) );		
	}
	
	public static void subtract() {
		float num1;
		float num2;
		
		System.out.print("\nIntroduzca el primer n�mero flotante a restar: ");
		num1 = reader.nextFloat();
		
		System.out.print("Introduzca el segundo n�mero flotante a restar: ");
		num2 = reader.nextFloat();
		
		System.out.println("La resta de "+ num1 +" y "+ num2 +" es "+ (num1-num2) );		
	}
	
		
	public static void main(String[] args) {


		int optionSelected;
		


		try {
			do {
				printMenu();
				
				System.out.print("\n\nIntroduzca una opci�n:");
				optionSelected = reader.nextInt();

				switch (optionSelected) {
					case 1:
						add();
						break;
					case 2:
						subtract();
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
						System.out.println("El programa ha finalizado");
						break;
					default:
						System.out.println("Opci�n err�nea");
						break;
				}

			} while (optionSelected != 0);

		} finally {
			reader.close();
		}

	}

}
