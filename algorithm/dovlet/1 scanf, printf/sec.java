import java.util.*;public class sec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), t;
		t=(a/(24*60*60))>0?(a/(24*60*60)):0; System.out.print(t+" "); //일
		t=((a%(24*60*60))/(60*60))>0?((a%(24*60*60))/(60*60)):0; System.out.print(t+" "); //시
		t=(a%(60*60)/60)>0?(a%(60*60)/60):0; System.out.print(t+" "); //분
		System.out.print(a%60); //초
	}
}

/*초(second)가 입력으로 주어진다.

이 를 몇 날 몇 시간 몇 분 몇 초 인지를 변경하는 프로그램을 작성하시오.

입력

초(second)가 입력으로 주어진다. 10 000 000 이하의 정수 이다.
출력

4 개의 정수를 출력한다.
날 시 분 초

입출력 예

입력

70

출력

0 0 1 10*/