long factorial(int);
 
int main()
{
  int number;
  long fact = 1;
 

  scanf("%d", &number);
 
  printf("%ld\n", factorial(number));
 
  return 0;
}
 
long factorial(int n)
{
  int c;
  long result = 1;
 
  for (c = 1; c <= n; c++)
    result = result * c;
 
  return result;
}