#include<stdio.h>
int main()
{
  int i,j,n,a,b,c=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
      a=i*2;
      c++;
      if(c==n)
        break;
      a=i;
      c++;
      if(c==n)
        break;
    }
    printf("%d",a);
	//type your code here
	
}