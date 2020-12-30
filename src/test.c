#include <stdio.h>

int sum(int a, int b) {
	int c = a + b;
	return c;
}

int main() {
	printf("%d\n", sum(3, 5));
	return 0; 
}
