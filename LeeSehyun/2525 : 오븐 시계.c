#include<stdio.h>
int main()
{
	int H, M;
	int timer;
	scanf_s("%d%d", &H, &M);
	scanf_s("%d", &timer);

	H += timer / 60;          //시간은 timer를 60으로 나눈값을 더한다.
	M += timer % 60;          //분은 timer를 60으로 나누고 나머지 값을 더한다.

	if (M >= 60) { //더해진 후의 분이 60이상일때
		H += 1;     //시간에 1을 더함  
		M -= 60;    //1시간이 더해졌으므로 60분 차감
	}
	if (H >= 24) { //시간이 24를 넘어가는 경우
		H -= 24;     
	}
	printf("%d %d", H, M);
}
