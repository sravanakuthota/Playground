#include<stdio.h>
int main()
{
  int l,i;
  char str[100];
  scanf("%[^\n]s", str);
  l=strlen(str);
  //printf("%d",l);
  for(i=0;i<l;i++)
  {
    if(str[i] == 'a' || str[i] =='A'||str[i] =='e'||str[i] =='E'||str[i] =='i'||str[i] =='I'||str[i] =='o'||str[i] =='O'||str[i] =='u'||str[i] =='U');
      
    else
      printf("%c",str[i]);
  }
  //Type your code here
  
  return 0;
}