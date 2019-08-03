#include <stdio.h>
int main() {
  int n,last;
  scanf("%d",&n);
  last=n%10;
  while(n>9)
  {
   	n=n/10; 
  }
  printf("%d",last+n);
	//Type your code
	return 0;
}