#include <stdio.h>

// 冒泡排序函数
void bubbleSort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        // 标记是否发生交换，优化最好情况
        int swapped = 0;
        
        // 最后 i 个元素已经有序
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // 交换元素
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = 1;
            }
        }
        
        // 如果没有发生交换，说明已经有序
        if (!swapped) break;
    }
}

// 打印数组
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("原始数组: \n");
    printArray(arr, n);

    bubbleSort(arr, n);

    printf("排序后的数组: \n");
    printArray(arr, n);

    return 0;
}
