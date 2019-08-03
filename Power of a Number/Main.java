#include <stdio.h>
#include <math.h>
int main()
{
  double a,b;
  scanf("%lf%lf",&a,&b);
  if(b<0)
  	printf("Wrong input");
  else
  	printf("%.0lf",pow(a,b));
  	//Your code here       
    return 0;
}