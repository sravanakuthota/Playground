// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here
  int num1,num2,i,gcd;
  scanf("%d%d",&num1,&num2);
  for(int i = 1; i <= num1 && i <= num2; i++)
  {
    if(num1%i==0 && num2%i==0)
      gcd = i;
  }
  printf("%d",gcd);
  
   return 0;
}