void main()
{
	int a,b;

	scanf("%d%d",&a,&b);
	if(a==b) {
		printf("=");
	} else if (a>b) {
		printf(">");
	} else {
		printf("<");
	}
}

/*두 정수를 입력으로 받아

앞수가 뒷수 보다 크면 >
앞수가 뒷수 보다 작으면 <
같으면 =
를 출력하는 프로그램을 작성하세요.
입출력 예

입력

3 4

출력

<

입력

4 4

출력

=*/