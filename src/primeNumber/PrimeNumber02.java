// 사용자한테 n을 입력받아 그 수가 소수인지 판별하는 프로그램을 작성해보세요.

package primeNumber;

import java.util.Scanner;
public class PrimeNumber02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		String result = "";
		int cnt=0;
		
		System.out.println("수를 입력하세요");
		n = sc.nextInt();
		
		for (int i=1 ; i <= n ; i++) {
			if (i % n == 0) 
				cnt++;
		}
		
		if (cnt == 2) 
			result = "소수임";
		else
			result = "소수아님";
		
		System.out.println(n + " 은(는) " + result );
		
	}

}
