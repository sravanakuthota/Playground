#include<stdio.h>
#include<stdlib.h>
int main()
{
	//type your code here
  int n,i,j,c=1,k;
  char s[20];
  scanf("%s",&s);
  for(i=0;s[i]!='\0';i++)
    k=i;
  if(k>20)
    printf("Invalid Input");
  else
  {
    for(j=0;j<=k;j++)
    {
      if(s[j]==s[j+1])
        c++;
      else
      {
        printf("%c%d",s[j],c);
        c=1;
      }
    }
  }
}