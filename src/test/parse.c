#include <stdio.h>
#include <stdlib.h>

int A[1000];

void swap(int *a, int* b) {
	int temp = *a;
	*a = *b;
	*b = temp;
}

void quickSort(int begin, int end) {
	if (begin < end) {
		int r = end;
		int p = begin;
		int i = ((rand() << 16) | (rand() << 2) | (rand())) % (r - p) + p;
		swap(&A[p], &A[i]);
		int x = A[p];
		int	q = p, t = p;
		for (int j = p + 1;j < r;++j) {
			if (A[j] < x) {
				swap(&A[j], &A[q]);
				swap(&A[j], &A[t + 1]);
				++q, ++t;
			}
			else if (A[j] == x) {
				swap(&A[j], &A[t + 1]);
				++t;
			}
		}
		quickSort(begin, q);
		quickSort(t + 1, end);
	}
}

int main() {
	int len = 0;
	printf("Please input array length:");
	scanf("%d", &len);
	printf("Input every array element:");
	int i;
	for (i = 0; i < len; i += 1){
		scanf("%d", &A[i]);
 	}
	quickSort(0, len);
	for (i = 0; i < len; i += 1){
		printf("%d ", A[i]);
	}
	return 0;
}