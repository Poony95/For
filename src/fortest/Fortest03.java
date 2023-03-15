//화면에 hello 5번 출력하기

package fortest;


public class Fortest03 {

	public static void main(String[] args) {

		/*
		for(int i=1; i<=5; i++){			기본
			System.out.println("hello");
		}*/

		/*
		for( int i=5 ; i>0  ; i--   ){		음수로도 가능
			System.out.println("hello");
		}
		*/
		
		for(int i=100; i<=500; i+=100 ){	// 여러 숫자단위로도 가능
			System.out.println("hello");
		}
	}

}
