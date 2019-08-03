#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  if(a%4==0)
  {
    if(a%400!=0)
      printf("NOT LEAP YEAR");
    else
    printf("LEAP YEAR");
  }
  else
    printf("NOT LEAP YEAR");
  //Type your code here
  return 0;
}