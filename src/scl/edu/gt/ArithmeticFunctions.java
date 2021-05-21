package scl.edu.gt;

import java.util.Scanner;

public class ArithmeticFunctions {

/*	public static double sumar(double numeral1,double numeral2) {
		double resultado = numeral1 + numeral2;
		return resultado;
	}*/
	
	public static void sumar() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.println("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.println("num_2: ");
		double num2 = numeral2.nextDouble();
		
		double respuesta = num1 + num2;
		
		System.out.println(respuesta);
	}
	
	public static void restar() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.println("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.println("num_2: ");
		double num2 = numeral2.nextDouble();
		
		double respuesta = num1 - num2;
		
		System.out.println(respuesta);
	}
	
	public static void multiplicar() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.println("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.println("num_2: ");
		double num2 = numeral2.nextDouble();
		
		double respuesta = num1 * num2;
		
		System.out.println(respuesta);
	}
	
	public static void dividir() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.println("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.println("num_2: ");
		double num2 = numeral2.nextDouble();
		
		double respuesta = num1 / num2;
		
		System.out.println(respuesta);
	}
	
	public static void residuo() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.println("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner(System.in);
		System.out.println("num_2: ");
		double num2 = numeral2.nextDouble();
		
		double respuesta = num1 % num2;
		
		System.out.println(respuesta);
	}
	
}
