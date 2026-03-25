public class BubbleSort {
    
    /**
     * 冒泡排序算法实现
     * @param array 待排序的整数数组
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        
        // 外层循环控制趟数
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // 内层循环进行相邻元素比较和交换
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // 交换元素
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // 如果某一趟没有发生交换，说明数组已经有序，提前结束
            if (!swapped) {
                break;
            }
        }
    }
    
    /**
     * 打印数组内容
     * @param array 要打印的数组
     */
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    /**
     * 主方法 - 测试冒泡排序
     */
    public static void main(String[] args) {
        // 测试数据
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("原始数组:");
        printArray(array);
        
        // 执行冒泡排序
        bubbleSort(array);
        
        System.out.println("排序后的数组:");
        printArray(array);
        
        // 更多测试用例
        int[] array2 = {5, 1, 4, 2, 8};
        System.out.println("\n原始数组2:");
        printArray(array2);
        bubbleSort(array2);
        System.out.println("排序后的数组2:");
        printArray(array2);
    }
}
