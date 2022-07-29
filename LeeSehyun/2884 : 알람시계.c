#include<stdio.h>
int main() 
{
int hour, minute;
scanf_s("%d%d", &hour, &minute); 

if (hour==0) //시간이 0일때
{
	if (minute>=45) //시간이 0시면서 45분보다 같거나 클때
	{
		minute -= 45;
	}
	else //시간이 0시면서 45분보다 크지 않을때 (작을 때)
	{
		hour = 23;
		minute +=15;
	}
}
else //시간이 0시가 아닐때
{
	if (minute >= 45) //시간이 0시가 아니면서 45분보다 같거나 클때
	{
		minute -= 45;
	}
	else //시간이 0가 아니면서 45분보다 크지 않을때 (작을 때)
	{
		hour -= 1;
		minute += 15; //45분을 빼고 60이랑 더하는 연산을 한 줄로 줄임 ㅎㅎ
	}
}
printf("%d %d",hour,minute);
return 0;
