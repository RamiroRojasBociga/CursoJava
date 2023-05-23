package cursoJava;
import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		float sueldo;
		System.out.println("Introduce el sueldo");
		sueldo=teclado.nextFloat();
		
		if (sueldo>3000) {
			System.out.println("El usuario debe hacer el impuesto a la renta");
		}
		if (sueldo<=3000) {
			System.out.println("El usuario esta excento de declarar renta");
		}
		if (sueldo>6000&&sueldo<10000) {
			System.out.println("El usuario tiene que pagar una bonificacion de 1000");
		}
		if (sueldo==20000||sueldo==30000) {
			System.out.println("El usuario tiene que pagar un 10% de su sueldo");
		
		}

	}

}
