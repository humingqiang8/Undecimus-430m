def bubble_sort(arr):
    """
    冒泡排序算法
    
    参数:
        arr: 待排序的列表
    
    返回:
        排序后的列表
    """
    n = len(arr)
    
    # 遍历所有数组元素
    for i in range(n):
        # 最后 i 个元素已经有序，不需要再比较
        swapped = False
        
        for j in range(0, n - i - 1):
            # 如果当前元素大于下一个元素，则交换它们
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
        
        # 如果没有发生交换，说明数组已经有序，可以提前结束
        if not swapped:
            break
    
    return arr


# 测试示例
if __name__ == "__main__":
    # 测试用例1: 普通数组
    arr1 = [64, 34, 25, 12, 22, 11, 90]
    print("原始数组:", arr1)
    print("排序后:", bubble_sort(arr1.copy()))
    
    # 测试用例2: 已排序数组
    arr2 = [1, 2, 3, 4, 5]
    print("\n原始数组:", arr2)
    print("排序后:", bubble_sort(arr2.copy()))
    
    # 测试用例3: 逆序数组
    arr3 = [5, 4, 3, 2, 1]
    print("\n原始数组:", arr3)
    print("排序后:", bubble_sort(arr3.copy()))
    
    # 测试用例4: 包含重复元素
    arr4 = [3, 1, 4, 1, 5, 9, 2, 6]
    print("\n原始数组:", arr4)
    print("排序后:", bubble_sort(arr4.copy()))
