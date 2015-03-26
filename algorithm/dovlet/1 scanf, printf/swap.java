import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), t;
		
		t = a; a = b; b = t;

		System.out.println(a + " " + b);
	}
}

/*두 정수를 입력으로 받아 수를 교환하는 프로그램을 작성하시오.
입력

두 정수가 입력으로 주어진다.
출력

두 정수를 바꾸어서 출력한다.
입출력 예

입력

10 20

출력

20 10

입력

5 1

출력

1 5*/