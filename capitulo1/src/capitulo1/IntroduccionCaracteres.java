package capitulo1;

import java.util.Scanner;

public class IntroduccionCaracteres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Recordando como imprimir en pantalla");
		
		System.out.println("Escribe tu nombre");
		String nombre1 = sc.nextLine();
		
		System.out.println("Muy bien, tu nombre es: " + nombre1);
		
		System.out.println("Escribe ahora tu edad");
		int edad1 = sc.nextInt();
		
		System.out.println("Tu edad es: " + edad1);

	}

}
