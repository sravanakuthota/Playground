#include<stdio.h>
int main()
{
  int i,n,f,s,t;
  scanf("%d",&n);
  f=0;
  s=1;
  
  if(n==1)
    printf("%d ",f);
  else if(n==2)
  {
    printf("%d ",f);
  	printf("%d ",s);
  }
  else
  {
    printf("%d ",f);
  	printf("%d ",s);
    for(i=2;i<n;i++)
    {
      t=f+s;
      printf("%d ",t);
      f=s;
      s=t;
    }
  }
      
    
  //Type your code here
  return 0;
}