import java.util.*;public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println((a/100)+" "+(a%100/50)+" "+(a%50/10));
	}
}

/*상점에서 물건을 사고 지폐로 돈을 내면 거스름 돈을 줘야 한다. 이 때 동전을 어떻게 해서 줘야 하는지 계산하시오.
돈은 반드시 1000 원을 내며 , 거스름 돈은 10 원 , 50 원 , 100 원 동전으로 하고 큰 동전 우선으로 준다.

입력

물건 값으로 세자리 자연수가 입력으로 주어진다. 일의 자리는 0 이다.
출력

동전 100 원 , 50 원 , 10 원의 개수를 출력한다.
입출력 예

입력

530

출력

4 1 2*/