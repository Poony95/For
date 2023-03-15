// 임의의 개수 n을 입력받아 1~n까지의 짝수의 합, 개수/ 홀수의 합, 개수를 출력하라.

package evenOdd;

import java.util.Scanner;
public class EvenOddtest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		int even_sum=0;
		int even_cnt=0;
		int odd_sum=0;
		int odd_cnt=0;
		
		System.out.println("n을 입력하세요==>");
		n = sc.nextInt(); 
		
		for(int i=1;i<=n;i++) {
		if (i % 2 == 0) {
			even_sum += i;
			even_cnt++;
		}
		else {
			odd_sum += i;
			odd_cnt++;
		}
		}
	
	System.out.println("짝수 합 : " + even_sum);
	System.out.println("짝수 개수 : " + even_cnt);
	System.out.println("홀수합 : " + odd_sum);
	System.out.println("홀수 개수 : " + odd_cnt);
	}

}
