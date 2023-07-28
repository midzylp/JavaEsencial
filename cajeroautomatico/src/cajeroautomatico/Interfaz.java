package cajeroautomatico;

import java.util.Scanner;

public class Interfaz {

	public static void main(String[] args) {
		
		
		/*
		 * Programa que emula la interfaz de un cajero automatico. El programa presentará las siguientes
		 * opciones.
		 * 
		 * Elija una de las siguientes opciones.
		 * 
		 * 1- Para consultar tu saldo
		 * 2- Para ingresar dinero
		 * 3- Para retirar dinero
		 * 4- Para consultar sus ultimos movimientos
		 * 
		 * Una vez escrita su opcion presione la tecla enter
		 * 
		 */
			
		Scanner escan = new Scanner(System.in);
		
		System.out.println("Elija una de las siguientes opciones. \n1-Para consultar su saldo \n2-Para ingresar dinero \n3-Para retirar dinero \n4-Para consultar su ultimo movimiento");
		
		System.out.println("Presione enter despues de ingresar el número");
		int opcion = escan.nextInt();
		
		if(opcion == 1) {
			System.out.println("La opción que usted seleccionó corresponde a la consulta de saldo");
		} else if (opcion == 2) {
			System.out.println("La opción que usted seleccionó corresponde al ingreso de dinero");
		} else if (opcion == 3) {
			System.out.println("La opción que usted seleccionó coresponde al retiro de dinero");
		} else if (opcion == 4) {
			System.out.println("La opción que usted seleccionó corresponde a la consulta de su ultimo movimiento");
		} else {
			System.out.println("La opción que usted seleccionó no existe");
		}
		
	}

}
