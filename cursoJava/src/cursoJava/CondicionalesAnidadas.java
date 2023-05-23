package cursoJava;

import java.util.Scanner;

public class CondicionalesAnidadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado= new Scanner(System.in);
		int nota1, nota2, nota3;
		System.out.println("Ingrese la primer nota");
		nota1=teclado.nextInt();
		System.out.println("Ingrese la segunda nota");
		nota2=teclado.nextInt();
		System.out.println("Ingrese la tercera nota");
		nota3=teclado.nextInt();
		
		int media=(nota1+nota2+nota3)/3;
		
		if (media>=7) {
			System.out.println("notable/sobresaliente");
		}else if (media>=4) {
				System.out.println("regular/bien");
				
			}else {
				System.out.println("que malo");
			}
				

	}

}
