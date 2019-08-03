#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  long int n,i=0,j=0,sum=0,c=0;
  scanf("%ld",&n);
  while(n>0)
  {
    sum=sum+(n%10)*pow(2,i);
    n=n/10;
    i++;
  }
  while(sum>0)
  {
    c=c+(sum%8)*(pow(10,j));
    sum=sum/8;
    j++;
  }
  printf("%ld",c);
}