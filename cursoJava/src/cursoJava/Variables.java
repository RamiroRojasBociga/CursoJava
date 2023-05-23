package cursoJava;

import java.util.Scanner;


public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		String texto;
		float division;
		int num1, num2, suma, producto;
		
		texto= "ingrese un valor:";
		
		//introduccion de valores por teclado
		System.out.println(texto);
		num1=teclado.nextInt();
		System.out.println(texto);
		num2=teclado.nextInt();
		
		//hacer operaciones
		suma=num1+num2;
		producto=num1*num2;
		division=num1/num2;
		
		//imprimir los resultados
		System.out.println("El resultado de la suma es: "+ suma);
		System.out.println("El resultado de la multiplicacion es: "+ producto);
		System.out.println("El resultado de la division es: "+ division);
		
		

	}

}
