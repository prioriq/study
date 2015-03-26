import java.util.*; public class angle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println( (a*180-360) + " 360" );
	}
}

// 내각의 합: 180(n-2)
// 외각의 합: 360 (항상)

/*n 각형의 내각의 합과 외각의 합을 구하는 문제이다.

입력

n 은 3 이상 20 이하의 정수이다.
출력

내각의 합, 외각의 합을 출력한다.
입출력 예

입력

3

출력

180 360*/