#include<stdio.h>

int main()
{
	double a = 0.1;
	float b = 0.1;
	printf("0.1 == 0.1 => %d\n", 0.1 == 0.1);
	printf("0.1 == 0.1f => %d\n", 0.1 == 0.1f);
	printf("a(double) == b(float) => %d\n", a == b);
	return 0;
}
