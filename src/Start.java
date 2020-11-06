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

	
	public static float callForNumbersTo(int option, String operation) {
		float number;

		if (option == 1)
			System.out.print("\nIntroduzca el primer número flotante a "+ operation + ": ");
		else if (option == 2)
			System.out.print("Introduzca el segundo número flotante a "+ operation + ": ");
		else if (option == 3)
			System.out.print("Introduzca el tercer número flotante a "+ operation + ": ");
		return number = reader.nextFloat();
	}

	
	public static float add(float num1, float num2) {
		return (num1 + num2);
	}

	public static float subtract(float num1, float num2) {
		return (num1 - num2);
	}
	
	public static float multiply(float num1, float num2) {
		return (num1 * num2);
	}

	public static void errorDivideBy0() {
		System.out.print("Error division por 0");
	}

	public static float divide(float num1, float num2) {
		if (num2 != 0) {
			return (num1 / num2);
		} else {
			return (-1.0F);
		}
	}

	public static float rest(float num1, float num2) {
		if (num2 != 0) {
			return (num1 % num2);
		} else {
			return (-1.0F);
		}
	}


	public static String zodiac(int numberMonth) {
		
		switch (numberMonth) {
			case 1:
				return "Su signo zodiacal es Aries";
			case 2:
				return "Su signo zodiacal es Tauro";
			case 3:
				return "Su signo zodiacal es éminis";
			case 4:
				return "Su signo zodiacal es Cáncer";
			case 5:
				return "Su signo zodiacal es Leo";
			case 6:
				return "Su signo zodiacal es Virgo";
			case 7:
				return "Su signo zodiacal es Libra";
			case 8:
				return "Su signo zodiacal es Escorpio";
			case 9:
				return "Su signo zodiacal es Sagitario";
			case 10:
				return "Su signo zodiacal es Capricornio";
			case 11:
				return "Su signo zodiacal es Acuario";
			case 12:
				return "Su signo zodiacal es Piscis";
			default: // En principio nunca entraría aquí
				return "Error debe introducer un número del 1 al 12";
		}
	}

	public static float mayor(float numb1, float numb2, float numb3) {
		
		if( numb1 == numb2 && numb2 == numb3) {
			return -1;
		} else {
			if (numb1 > numb2 && numb1 > numb3) {
				return numb1;
			} else if (numb2 > numb3) {
				return numb2;
			} else {
				return numb3;
			}
		}
	}



	public static boolean isCapicua(int number) {

		String numberString;
		String numberStringReversed;

		numberString = Integer.toString(number);

		numberStringReversed = new StringBuffer(numberString).reverse().toString();

		if (numberString.equals(numberStringReversed)) {
			System.out.print("\nSI es capicúa");
			return true;
		} else {
			System.out.print("\nNO es capicúa");
			return false;
		}
	}

	public static long factorial(int number) {

		if (number < 1)
			return -1;
		else if (number == 1)
			return 1;
		else
			return (number * factorial(number - 1));
	}


	public static void main(String[] args) {

		int optionSelected;
		float numberFloat1;
		float numberFloat2;
		float numberFloat3;
		int monthNumber;
		int numberInt1;

		try {
			do {
				printMenu();

				System.out.print("\n\nIntroduzca una opción:");
				optionSelected = reader.nextInt();

				switch (optionSelected) {
					case 1:
						numberFloat1 = callForNumbersTo(1, "sumar");
						numberFloat2 = callForNumbersTo(2, "sumar");
						System.out.println("La suma de " + numberFloat1 + " y " + numberFloat2 + " es " + add(numberFloat1, numberFloat2));
						break;
					case 2:
						numberFloat1 = callForNumbersTo(1, "restar");
						numberFloat2 = callForNumbersTo(2, "restar");
						System.out.println("La resta de " + numberFloat1 + " y " + numberFloat2 + " es " + subtract(numberFloat1, numberFloat2));
						break;
					case 3:
						numberFloat1 = callForNumbersTo(1, "multiplicar");
						numberFloat2 = callForNumbersTo(2, "multiplicar");
						System.out.println("La multiplicación de " + numberFloat1 + " y " + numberFloat2 + " es " + multiply(numberFloat1, numberFloat2));
						break;
					case 4:
						numberFloat1 = callForNumbersTo(1, "dividir");
						numberFloat2 = callForNumbersTo(2, "dividir");
						if(divide(numberFloat1, numberFloat2) == -1)
							errorDivideBy0();
						else
							System.out.println("La division de " + numberFloat1 + " y " + numberFloat2 + " es " + divide(numberFloat1, numberFloat2));
						break;
					case 5:
						numberFloat1 = callForNumbersTo(1, "dividir");
						numberFloat2 = callForNumbersTo(2, "dividir");
						if(rest(numberFloat1, numberFloat2) == -1)
							errorDivideBy0();
						else
							System.out.println("La division de " + numberFloat1 + " y " + numberFloat2 + " es " + rest(numberFloat1, numberFloat2));
						break;
					case 6:
						System.out.print("\nIntroduzca su mes de nacimiento(1-12): ");
						monthNumber = reader.nextInt();
						System.out.println(zodiac(monthNumber));
						break;
					case 7:
						numberFloat1 = callForNumbersTo(1, "comparar");
						numberFloat2 = callForNumbersTo(2, "comparar");
						numberFloat3 = callForNumbersTo(3, "comparar");
						if(mayor(numberFloat1, numberFloat2, numberFloat3) == -1)
							System.out.println("Los 3 numeros son iguales");
						else	
							System.out.println("El numero " + mayor(numberFloat1, numberFloat2, numberFloat3) + " es el mayot de los 3 números");
						break;
					case 8:
						System.out.println("Introduzca un número para saber si es capicúa: ");
						numberInt1 = reader.nextInt();
						isCapicua(numberInt1);
						break;
					case 9:
						System.out.print("\nIntroduzca un número para calcular el factorial: ");
						numberInt1 = reader.nextInt();

						if (factorial(numberInt1) == -1)
							System.out.println("\nError valor inferior a 0, introduzca un valor superior a 0");
						else
							System.out.println("\nEl factorial es: " + factorial(numberInt1));
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
