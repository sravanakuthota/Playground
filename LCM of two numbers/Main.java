#include<stdio.h>
int main()
{
  int num1,num2,min;
  scanf("%d%d",&num1,&num2);
  min=num1>num2 ? num1 : num2;
  while(1)
  {
    if(min%num1==0 && min%num2==0)
    {
      printf("%d",min);
      break;
    }
    min++;
  }
  //Type your code here
  return 0;
}