import java.util.*;public class koi_watch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), t;

		/*int total = c + b*60 + a*3600 + d;

		int ad, ah, am, as;

		d = (total>=86400) ? total%86400 : total;
		ah = (d>=3600) ? d/3600 : d;
		d = d%3600;
		am = (d>=60) ? d/60 : d;
		as = d%60;*/

		System.out.println(ah + " " + am + " " + as);

		t = d%86400; // 일 24*60*60
		a += t/3600; // 시 60*60
		t = t%3600;
		b += t/60; // 분
		c += t%60; // 초
		b += (c>59)? 1:0; c = (c>59)? c-60:c; // b += (c>59)? ++b: b; 가 안됨.. 왜?
		a += (b>59)? 1:0; b = (b>59)? b-60:b;
		a = (a>23)? a-24:a; 
		System.out.println(a+" "+b+" "+c);
	}
}

/*KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 초 단위로 자동적으로 계산한다.

또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.

훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 초 단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.

입력

첫 째 줄에는 현재 시각이 나온다.
시 A (0 <= A <= 23)
분 B ( 0 <= B <= 59)
초 C ( 0 <= C <= 59)
두 번째 줄에는 요리하는 데 필요한 시간 D ( 0 <= D <= 500 000)가 초 단위로 주어진다.
출력

첫째 줄에 종료되는 시각의 시, 분, 초을 공백을 사이에 두고 출력한다. (단, 시는 0부터 23까지의 정수이며, 분, 초는 0부터 59까지의 정수이다. 디지털 시계는 23시 59분 59초에서 1초가 지나면 0시 0분 0초가 된다.)
입출력 예

입력 

14 30 0
200

출력 

14 33 20

입력 

17 40 45
6015

출력 

19 21 0

입력 

23 48 59
2515

출력 

0 30 54
출처:2012 지역 본선 중등 1/5*/