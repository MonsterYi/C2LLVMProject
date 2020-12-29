#include <stdio.h>
int A[1000];

int main() {
	int len = 0;
	printf("Please input array length:");
	scanf("%d", &len);
	
	printf("Please input array element:");
	int i,j,k;
	for (i = 0; i < len; i += 1){
		scanf("%d", &A[i]);
 	}
	int temp = len - 1;
	int temp1 = 0;
	for (i = 0;i < len;i += 1) {
		for (j = 0;j < temp;j += 1) {
			k = j + 1;
			if (A[j] > A[k]) {
				temp1 = A[j];
				A[j] = A[k];
				A[k] = temp1;
			}
		}
	}
	for (i = 0; i < len; i += 1){
		printf("%d ", A[i]);
	}
	return 0;
}