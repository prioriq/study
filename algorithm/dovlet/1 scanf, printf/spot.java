import java.util.*; public class spot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float d = sc.nextFloat(), p = sc.nextFloat();
		System.out.printf("%.3f", -(p*d)/100);
		// System.out.println( String.format("%.3f", -(p*d)/100) ); // 속도가 핵쓰레기임...
	}
}

/*
r:d = r{(100+p)/100}:x
x = d{(100+p)/100}

구하고자 하는 것: d-x
 = -pd/100
*/

// special judge
/*받침대에 있는 프로젝터가 벽 쪽으로 둥글게 빛을 쏜다.

d 가 프로젝터와 벽까지의 수평 거리이고 , r 은 빛이 있는 영역의 반지름이고 A 는 수평각이다. (아래 그림 참조)





우리는 반지름을 p 퍼센트 변화하기를 원한다.

예를 들어, p 가 -25 이면 r 을 25 퍼센트 줄이기를 원한다는 것을 의미한다. 만약 p 가 50 이면 반지름을 50 퍼센트 증가한다는 것이다.

각 A 가 변함이 없다고 가정할 때 얼마나 멀리 그리고 어떤 방항으로 프로젝트를 움직여야 하는지를 알아내어야 한다.

입력

입력은 두 줄로 이루어진다.
한 줄에는 d 가 1 과 40 사이의 실수가 주어지고 ,
다음 줄에는 p 가 -95 와 300 사이의 실수로 주어진다.
출력

프로젝트 위치의 변화를 나타내는 수를 소수 이하 세자리(4 번째 자리에서 반올림) 까지 출력한다.
양수이면 프로젝트를 벽쪽으로 오른쪽으로 가깝게 하는 것을 음수이면 반대 편으로 즉 벽에서 더 멀어지는 것을 의미한다.

입출력 예

입력

28.5
-25.0

출력

7.125

입력

28.5
50.0

출력

-14.250

출처:cs.umd.edu high school programming contest*/