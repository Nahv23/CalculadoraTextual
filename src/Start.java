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

		System.out.println("La suma de " + num1 + " y " + num2 + " es " + (num1 + num2));
	}

	public static void subtract() {
		float num1;
		float num2;

		System.out.print("\nIntroduzca el primer n�mero flotante a restar: ");
		num1 = reader.nextFloat();

		System.out.print("Introduzca el segundo n�mero flotante a restar: ");
		num2 = reader.nextFloat();

		System.out.println("La resta de " + num1 + " y " + num2 + " es " + (num1 - num2));
	}

	public static void multiply() {
		float num1;
		float num2;
		
		System.out.print("\nIntroduzca el primer n�mero flotante a multiplicar: ");
		num1 = reader.nextFloat();
		
		System.out.print("Introduzca el segundo n�mero flotante a multiplicar: ");
		num2 = reader.nextFloat();
		
		System.out.println("La multiplicaci�n de " + num1 + " y " + num2 + " es " + (num1 * num2));
	}

	public static void divide() {
		float num1;
		float num2;

		System.out.print("\nIntroduzca el primer n�mero flotante a dividir: ");
		num1 = reader.nextFloat();

		System.out.print("Introduzca el segundo n�mero flotante a dividir: ");
		num2 = reader.nextFloat();

		if (num2 != 0) {
			System.out.println("La division de " + num1 + " y " + num2 + " es " + (num1 / num2));
		} else {
			System.out.println("Error division por 0");
		}

	}

	public static void rest() {
		float num1;
		float num2;

		System.out.print("\nIntroduzca el primer n�mero flotante a dividir: ");
		num1 = reader.nextFloat();

		System.out.print("Introduzca el segundo n�mero flotante a dividir: ");
		num2 = reader.nextFloat();

		if (num2 != 0) {
			System.out.println("EL RESTO de " + num1 + " y " + num2 + " es " + (num1 % num2));
		} else {
			System.out.println("Error division por 0");
		}

	}

	public static String zodiacSign(int number) {

		switch (number) {
		case 1:
			return "Aries";
		case 2:
			return "Tauro";
		case 3:
			return "G�minis";
		case 4:
			return "C�ncer";
		case 5:
			return "Leo";
		case 6:
			return "Virgo";
		case 7:
			return "Libra";
		case 8:
			return "Escorpio";
		case 9:
			return "Sagitario";
		case 10:
			return "Capricornio";
		case 11:
			return "Acuario";
		case 12:
			return "Piscis";
		default: // En principio nunca entrar�a aqu�
			return "Error debe introducer un n�mero del 1 al 12";
		}
	}

	public static void zodiac() {
		int monthNumber;

		System.out.print("\nIntroduzca su mes de nacimiento(1-12): ");
		monthNumber = reader.nextInt();

		if (1 <= monthNumber && monthNumber <= 12) {
			System.out.println("Su signo zodiacal es " + zodiacSign(monthNumber));
		} else {
			System.out.println("Error debe introducer un n�mero del 1 al 12 ");
		}

	}

	public static void checkBigestNumber(float numb1, float numb2, float numb3) {
		if (numb1 > numb2 && numb1 > numb3) {
			System.out.print("\nEl num�ro " + numb1 + " es el mayor de los 3 n�meros.");
		} else if (numb2 > numb3) {
			System.out.print("\nEl num�ro " + numb2 + " es el mayor de los 3 n�meros.");
		} else {
			System.out.print("\nEl num�ro " + numb3 + " es el mayor de los 3 n�meros.");
		}
	}

	public static void bigestNumber() {
		float number1;
		float number2;
		float number3;

		System.out.print("\nIntroduzca el primer n�mero flotante de los 3: ");
		number1 = reader.nextFloat();

		System.out.print("\nIntroduzca el segundo n�mero flotante de los 3: ");
		number2 = reader.nextFloat();

		if (number1 == number2) {
			System.out.print(
					"\nEl numero 2 no puede ser igual que el 1. Introduzca de nuevo el segundo n�mero flotante de los 3: ");
			number2 = reader.nextFloat();
		}

		System.out.print("\nIntroduzca el tercer n�mero flotante de los 3: ");
		number3 = reader.nextFloat();

		if (number1 == number3 || number2 == number3) {
			System.out.print(
					"\nEl numero 2 no puede ser igual que los anteriores. Introduzca de nuevo el tercer n�mero flotante de los 3: ");
			number3 = reader.nextFloat();
		}

		checkBigestNumber(number1, number2, number3);

	}
	
	public static void isCapicua() {
		
		String numberString;
		String numberStringReversed;

		
		System.out.println("Introduzca un n�mero para saber si es capic�a: ");
		numberString = reader.next();
		
		numberStringReversed = new StringBuffer(numberString).reverse().toString(); 
		
		if (numberString.equals(numberStringReversed)) {
			System.out.print("\nSI es capic�a");
		} else {
			System.out.print("\nNO es capic�a");
		}
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
					multiply();
					break;
				case 4:
					divide();
					break;
				case 5:
					rest();
					break;
				case 6:
					zodiac();
					break;
				case 7:
					bigestNumber();
					break;
				case 8:
					isCapicua();
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
