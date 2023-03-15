package fortest;


public class Fortest02 {

	public static void main(String[] args) {

		int i;
		for( i=0 ; i<=10 ; i++) {
			System.out.println(i);
		}
		
		System.out.println("작업종료");
		System.out.println("i : " + i);	//바깥으로 i를 가져오고 싶을 때에는 int i를 밖으로 빼줌.
	}

}
