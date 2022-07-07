#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
# define SWAP(x, y, temp) ( (temp)=(x), (x)=(y), (y)=(temp) )

int partition(int a[], int left, int right) {
	int pivot, temp;
	int low, high;

	low = left;
	high = right + 1;
	pivot = a[left];

	do {
		do {
			low++;
		} while (low <= right && a[low] < pivot);
		do {
			high--;
		} while (high >= left && a[high] > pivot);

		if (low < high) {
			SWAP(a[low], a[high], temp);
		}
	} while (low < high);

	SWAP(a[left], a[high], temp);
	return high;
}

void quick_sort(int a[], int left, int right) {
	if (left < right) {
		int q = partition(a, left, right);

		quick_sort(a, left, q - 1);
		quick_sort(a, q + 1, right);
	}
}

int main() {
	int height[9] = { 0, };
	int seven[7] = { 0, };
	int i, sum=0, calc;
	int no_1, no_2;

	for (i = 0; i < 9; i++) {
		scanf("%d", &height[i]);
		sum += height[i];
	}
	calc = sum;
	srand((unsigned int)time(NULL));
	do {
		no_1 = rand() % 9;
		no_2 = rand() % 9;
		calc -= height[no_1];
		calc -= height[no_2];
		if (calc == 100) {
			i = 0;
			for (int j = 0; j < 9; j++) {
				if (j == no_1 || j == no_2) {
					continue;
				}
				else {
					seven[i] = height[j];
					i++;
				}
			}
		}
		else 
			calc = sum;
	} while (calc != 100);

	quick_sort(seven, 0, 6);

	for (i = 0; i < 7; i++) {
		printf("%d\n", seven[i]);
	}
	return 0;
}