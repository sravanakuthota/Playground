#include <stdio.h>
int main() {
  int n,i;
  scanf("%d",&n);
  for(i=1;i<=n*2;i++)
  {
    if(i%2==1)
      printf("%d\n",i);
  }
	//Type your code
	return 0;
}