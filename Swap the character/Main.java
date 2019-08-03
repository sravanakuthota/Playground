#include<stdio.h>
#include<stdlib.h>
int main()
{
  // type your code here 
  int i,j,a,b;
  char s1[100],s2[100],s3[100];
  scanf("%s",s1);
  scanf("%s",s2);
  scanf("%s",s3);
  for(j=0;s1[j]!='\0';j++);
  for(a=0;s2[a]!='\0';a++);
  for(b=0;s3[b]!='\0';b++);
  for(i=0;i<j;i++)
  {
    if(s1[i]=='a' || s1[i]=='A' || s1[i]=='e'|| s1[i]=='E'|| s1[i]=='i'|| s1[i]=='I'|| s1[i]=='o'|| s1[i]=='O'|| s1[i]=='u'|| s1[i]=='U')
      printf("$");
    else
      printf("%c",s1[i]);
  }
  for(i=0;i<a;i++)
  {
    if(s2[i]=='a' || s2[i]=='A' || s2[i]=='e'|| s2[i]=='E'|| s2[i]=='i'|| s2[i]=='I'|| s2[i]=='o'|| s2[i]=='O'|| s2[i]=='u'|| s2[i]=='U')
      printf("%c",s2[i]);
    else
      printf("#");
  }
  for (i = 0; i<b; i++)
  	{
  		if(s3[i] >= 'a' && s3[i] <= 'z')
  		{
  			s3[i] = s3[i] -32;
          	printf("%c",s3[i]);
		}
    	else
          printf("%c",s3[i]);
  	}
 
  
}