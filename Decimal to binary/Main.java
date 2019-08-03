#include<stdio.h>
int main()
{
  int n,i,a[32],k=0;
  scanf("%d",&n);
 while(n>0)
 {
   a[k]=n%2;
   
   n=n/2;
   k++;
 }
 
  for(i=k-1;i>=0;i--)
    printf("%d",a[i]);
  //Type your code here
  return 0;
}