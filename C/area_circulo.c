#include<stdio.h>
#include<stdlib.h>

#define pi 3.14159

int main()
{
  float r = 0;
  float a = 0;

  scanf("%f", &r);

  a = pi * (r*r);

  printf("A = %f\n", a);

  return 0;
}
