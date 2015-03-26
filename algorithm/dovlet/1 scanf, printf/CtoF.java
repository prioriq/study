import java.util.*;public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(Math.round(100*(1.8*a+32))/100.);
	}
}

/*
프로그램 명: CtoF
제한시간: 1 초
섭씨 온도를 화씨 온도로 변환하는 프로그램을 작성하세요.
화씨 온도 = 9 / 5 * 섭씨온도 + 32
입력

1 에서 100 사이의 자연수가 입력으로 주어진다.
출력

소수 첫째 자리까지 출력한다.
입출력 예

입력

50

출력

122.0
*/