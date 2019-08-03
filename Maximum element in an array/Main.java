#include<stdio.h>
int main()
{
  int n,a[100],i,max=-1000;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(i=0;i<n;i++)
  {
    if(a[i]>max)
      max=a[i];
  }
  printf("%d",max);
  	//type your code here
}