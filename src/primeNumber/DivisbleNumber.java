//사용자한테 n을 입력받아 n의 약수를 모두 출력하고, 약수의 개수를 구해 출력해보라.

package primeNumber;

import java.util.Scanner;
public class DivisbleNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		int cnt=0;
		
		System.out.println("n을 입력하시오==>");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.print(i+ " ");
				cnt++;
			}
		}
		System.out.println();
		System.out.println("약수의 개수는 : "+cnt);
	}

}
