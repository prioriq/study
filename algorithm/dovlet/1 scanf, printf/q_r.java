import java.util.*;public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		
		System.out.println(a/b +" "+ a%b);
	}
}

/*제한시간: 1 초
두 자연수를 입력으로 받아 첫 번째 수를 두 번째 수로 나눈 몫과 나머지를 구하는 프로그램을 작성하세요.
입력

두 자연수가 입력으로 주어진다. 두 수는 10000 이하의 자연수이다.
출력

몫 과 나머지를 출력한다.
입출력 예

입력

8 5

출력

1 3*/