#include<stdio.h>
int main()
{
  int n,i,j,a,b,c=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    a=pow(2,i);
    c++;
    if(c==n)
    {
      printf("%d",a);
      break;
    }
    b=pow(3,i);
    c++;
    if(c==n)
    {
      printf("%d",b);
      break;
    }
  }
  //type your code here
  return 0;
}