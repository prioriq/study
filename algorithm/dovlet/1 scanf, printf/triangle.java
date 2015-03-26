import java.util.*;public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		
		System.out.println(Math.round(100d*a*b/2)/100d);
	}
}

/*삼각형 넓이를 구하는 문제이다.

넓이 = 밑변 * 높이 / 2
입력

두 자연수가 입력으로 주어진다. 두 수는 1000 이하의 자연수이고 ,차례대로 밑변과 높이이다.
출력

넓이를 소수 이하 2 자리 ( 세 번째 자리에서 반올림 ) 까지 출력한다.
입출력 예

입력

9 83 

출력

373.50*/