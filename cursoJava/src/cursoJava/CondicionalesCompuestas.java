package cursoJava;

import java.util.Scanner;

public class CondicionalesCompuestas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner (System.in);
		int valor1,valor2;
		System.out.println("Introduce el sueldo");
		valor1=teclado.nextInt();
		System.out.println("Introduce el sueldo");
		valor2=teclado.nextInt();
		
		if (valor1>valor2) {
			System.out.println("El valor introducido en primer lugar el mayor: "+ valor1);
			
		}else {
			System.out.println("El valor introducido en segundo lugar el mayor: "+ valor2);
		}
		

	}

}
