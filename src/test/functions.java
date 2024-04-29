package test;

public class functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,4));
		System.out.println(substract(1,4));
		System.out.println(multiply(1,4));
		System.out.println(divide(8,4));
		System.out.println(divide(1,0));
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static int substract(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static int divide(int a, int b) {
		if(b!=0) {
		return a / b;
		} else {
			System.out.println("Division par 0 inconcevable");
			return -999;
		}
		
	}
}
