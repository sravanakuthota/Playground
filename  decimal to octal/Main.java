#include<stdio.h>
int main()
{
  int n,i,a[100],c=0;
  scanf("%d",&n);
  while(n>0)
  {
    a[c]=n%8;
    n=n/8;
    c++;
  }
  for(i=c-1;i>=0;i--)
    printf("%d",a[i]);
  //type your code here
  return 0;
}