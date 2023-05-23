package cursoJava;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		int n, x;
		
		System.out.println("ingrese el valor final");
		
		n=teclado.nextInt();
		x=1;
		
		while (x <= n) {
			System.out.println(x + " ");
			x = x+1;
			
		}

	}

}
