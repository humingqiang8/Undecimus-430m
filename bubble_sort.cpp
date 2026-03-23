#include <iostream>
#include <vector>
using namespace std;

// 冒泡排序函数
void bubbleSort(vector<int>& arr) {
    int n = arr.size();
    bool swapped;
    
    // 外层循环控制趟数
    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        
        // 内层循环进行相邻元素比较和交换
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // 交换元素
                swap(arr[j], arr[j + 1]);
                swapped = true;
            }
        }
        
        // 如果这一趟没有发生交换，说明已经有序，提前结束
        if (!swapped) {
            break;
        }
    }
}

// 打印数组
void printArray(const vector<int>& arr) {
    for (int num : arr) {
        cout << num << " ";
    }
    cout << endl;
}

int main() {
    // 示例数组
    vector<int> arr = {64, 34, 25, 12, 22, 11, 90};
    
    cout << "排序前的数组: ";
    printArray(arr);
    
    bubbleSort(arr);
    
    cout << "排序后的数组: ";
    printArray(arr);
    
    return 0;
}
