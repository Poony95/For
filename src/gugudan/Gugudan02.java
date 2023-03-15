package gugudan;

import java.util.Scanner;
public class Gugudan02 {

	public static void main(String[] args) {
		
		int n;
		int result; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단");
		n = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			result = n*i;
			System.out.println(n + "*" + i + "=" + result);	
		}
		
	}
}
