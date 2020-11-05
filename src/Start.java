/*
 * 
 * Author: @Nerea Aparicio Hita 
 * 
 */

import java.util.Scanner;

public class Start {
	static Scanner reader = new Scanner(System.in);

	public static void printMenu() {
		System.out.println("\n_____________________________");
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
		System.out.println(" 9. Factorial ");
		System.out.println(" 0. Salir");
	}

	public static float add(float num1, float num2) {
		return (num1 + num2);
	}

	public static float callForNumbersToAdd(int option) {
		float number;
		
		 if (option == 1)
			System.out.print("\nIntroduzca el primer número flotante a sumar: ");
		else if (option == 2)
			System.out.print("Introduzca el segundo número flotante a sumar: ");
		return number = reader.nextFloat();

	}
	
	public static float callForNumbersToSubtract(int option) {
		float number;
		
		 if (option == 1)
			System.out.print("\nIntroduzca el primer número flotante a restar: ");
		 else if (option == 2)
			System.out.print("Introduzca el segundo número flotante a restar: ");
		return number = reader.nextFloat();

	}
	
	public static float subtract(float num1, float num2) {
		return (num1 - num2);
	}
	

	public static void multiply() {
		float num1;
		float num2;

		System.out.print("\nIntroduzca el primer número flotante a multiplicar: ");
		num1 = reader.nextFloat();

		System.out.print("Introduzca el segundo número flotante a multiplicar: ");
		num2 = reader.nextFloat();

		System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + (num1 * num2));
	}

	public static void divide() {
		float num1;
		float num2;

		System.out.print("\nIntroduzca el primer número flotante a dividir: ");
		num1 = reader.nextFloat();

		System.out.print("Introduzca el segundo número flotante a dividir: ");
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

		System.out.print("\nIntroduzca el primer número flotante a dividir: ");
		num1 = reader.nextFloat();

		System.out.print("Introduzca el segundo número flotante a dividir: ");
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
			return "Géminis";
		case 4:
			return "Cáncer";
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
		default: // En principio nunca entraría aquí
			return "Error debe introducer un número del 1 al 12";
		}
	}

	public static void zodiac() {
		int monthNumber;

		System.out.print("\nIntroduzca su mes de nacimiento(1-12): ");
		monthNumber = reader.nextInt();

		if (1 <= monthNumber && monthNumber <= 12) {
			System.out.println("Su signo zodiacal es " + zodiacSign(monthNumber));
		} else {
			System.out.println("Error debe introducer un número del 1 al 12 ");
		}

	}

	public static void checkBigestNumber(float numb1, float numb2, float numb3) {
		if (numb1 > numb2 && numb1 > numb3) {
			System.out.print("\nEl numéro " + numb1 + " es el mayor de los 3 números.");
		} else if (numb2 > numb3) {
			System.out.print("\nEl numéro " + numb2 + " es el mayor de los 3 números.");
		} else {
			System.out.print("\nEl numéro " + numb3 + " es el mayor de los 3 números.");
		}
	}

	public static void bigestNumber() {
		float number1;
		float number2;
		float number3;

		System.out.print("\nIntroduzca el primer número flotante de los 3: ");
		number1 = reader.nextFloat();

		System.out.print("\nIntroduzca el segundo número flotante de los 3: ");
		number2 = reader.nextFloat();

		if (number1 == number2) {
			System.out.print(
					"\nEl numero 2 no puede ser igual que el 1. Introduzca de nuevo el segundo número flotante de los 3: ");
			number2 = reader.nextFloat();
		}

		System.out.print("\nIntroduzca el tercer número flotante de los 3: ");
		number3 = reader.nextFloat();

		if (number1 == number3 || number2 == number3) {
			System.out.print(
					"\nEl numero 2 no puede ser igual que los anteriores. Introduzca de nuevo el tercer número flotante de los 3: ");
			number3 = reader.nextFloat();
		}

		checkBigestNumber(number1, number2, number3);

	}

	public static void isCapicua() {

		String numberString;
		String numberStringReversed;

		System.out.println("Introduzca un número para saber si es capicúa: ");
		numberString = reader.next();

		numberStringReversed = new StringBuffer(numberString).reverse().toString();

		if (numberString.equals(numberStringReversed)) {
			System.out.print("\nSI es capicúa");
		} else {
			System.out.print("\nNO es capicúa");
		}
	}

	public static long factorialCalculation(int number) {

		if (number < 1)
			return -1;
		else if (number == 1)
			return 1;
		else
			return (number * factorialCalculation(number - 1));
	}

	public static void factorialOption() {

		System.out.print("\nIntroduzca un número: ");
		int number = reader.nextInt();

		if (factorialCalculation(number) == -1)
			System.out.println("\nError valor inferior a 0, introduzca un valor superior a 0");
		else
			System.out.println("\nEl factorial es: " + factorialCalculation(number));
	}

	public static void main(String[] args) {

		int optionSelected;

		try {
			do {
				printMenu();

				System.out.print("\n\nIntroduzca una opción:");
				optionSelected = reader.nextInt();

				switch (optionSelected) {
				case 1:
					add(callForNumbersToAdd(1), callForNumbersToAdd(2));
					break;
				case 2:
					subtract(callForNumbersToSubtract(1),callForNumbersToSubtract(2));
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
				case 9:
					factorialOption();
					break;
				case 0:
					System.out.println("El programa ha finalizado");
					break;
				default:
					System.out.println("Opción errónea");
					break;
				}

			} while (optionSelected != 0);

		} finally {
			reader.close();
		}

	}

}
