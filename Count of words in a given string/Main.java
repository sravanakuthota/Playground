#include<stdio.h>

int main()
{
  int i,c=1;
  char s[1000];
  scanf("%[^\n]s",&s);
  for(i=0;s[i]!='\0';i++)
  {
    if(s[i]==' ')
      c++;
  }
  printf("%d",c);
  //Type your code here
  
}