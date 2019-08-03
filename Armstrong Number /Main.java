#include <stdio.h>
#include<math.h>
int main() {
  int n,i,k=0,temp,m,sum=0;
  scanf("%d",&n);
  temp=n;
  while(n>0)
  {
    n=n/10;
    k++;
  }
  n=temp;
  
  while(n>0)
  {
    m=n%10;
    sum=sum+pow(m,k);
    n=n/10;
  }
  if(sum==temp)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	//Type your code
	return 0;
}