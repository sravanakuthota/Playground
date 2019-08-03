#include<stdio.h>
int main()
{
  int n,a[100],i,n1,n2,c=0,b=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  
  scanf("%d %d",&n1,&n2);
  for(i=0;i<n;i++)
  {
    if(a[i]==n1){
      printf("Element 1 index = %d\n",i);
    c++;}

  }
  if(c==0)
      printf("Element 1 index = -1\n");
  for(i=0;i<n;i++)
  {
    if(a[i]==n2)
    {
      printf("Element 2 index = %d\n",i);
    b++;
    }   
  }
  if(b==0)
      printf("Element 2 index = -1\n");
  	//type your code here
}