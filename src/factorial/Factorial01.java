// 5*4*3*2*1 = _____ 가 나오게 출력하세요.

package factorial;
import java.util.Scanner;
public class Factorial01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, sum=1;
		
		System.out.println("n의 숫자를 적으세요");
		n = sc.nextInt();
		
		for(int i=n; i>=1; i--) {
			sum *= i;
			System.out.print(i);
			if (i != 1) {
				System.out.print("*");
			}
		}
		System.out.println("="+sum);
	}

}
