#include<stdio.h>
#include<math.h>
int main()
{
  int i,k=0,s=0;
  long int n;
  scanf("%d",&n);
  for(i=0;n!=0;i++)
  {
    s=s+(n%10)*pow(2,i);
    n=n/10;
    
  }
  printf("%d",s);
  //Type your code here
  return 0;
}