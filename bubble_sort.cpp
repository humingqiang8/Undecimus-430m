#include <iostream>
#include <vector>

// 冒泡排序函数
void bubbleSort(std::vector<int>& arr) {
    int n = arr.size();
    
    // 外层循环控制排序轮数
    for (int i = 0; i < n - 1; i++) {
        // 内层循环进行相邻元素比较和交换
        // 每轮结束后，最大的元素会"冒泡"到末尾
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // 交换相邻元素
                std::swap(arr[j], arr[j + 1]);
            }
        }
    }
}

// 打印数组函数
void printArray(const std::vector<int>& arr) {
    for (int num : arr) {
        std::cout << num << " ";
    }
    std::cout << std::endl;
}

int main() {
    // 示例数组
    std::vector<int> arr = {64, 34, 25, 12, 22, 11, 90};
    
    std::cout << "排序前的数组: ";
    printArray(arr);
    
    bubbleSort(arr);
    
    std::cout << "排序后的数组: ";
    printArray(arr);
    
    return 0;
}
