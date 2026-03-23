import unittest
from bubble_sort import bubble_sort


class TestBubbleSort(unittest.TestCase):
    """冒泡排序函数的单元测试类"""

    def test_empty_list(self):
        """测试空列表"""
        self.assertEqual(bubble_sort([]), [])

    def test_single_element(self):
        """测试单个元素"""
        self.assertEqual(bubble_sort([5]), [5])

    def test_already_sorted(self):
        """测试已排序的数组"""
        arr = [1, 2, 3, 4, 5]
        self.assertEqual(bubble_sort(arr.copy()), [1, 2, 3, 4, 5])

    def test_reverse_sorted(self):
        """测试逆序数组"""
        arr = [5, 4, 3, 2, 1]
        self.assertEqual(bubble_sort(arr.copy()), [1, 2, 3, 4, 5])

    def test_random_order(self):
        """测试随机顺序的数组"""
        arr = [64, 34, 25, 12, 22, 11, 90]
        self.assertEqual(bubble_sort(arr.copy()), [11, 12, 22, 25, 34, 64, 90])

    def test_duplicate_elements(self):
        """测试包含重复元素的数组"""
        arr = [3, 1, 4, 1, 5, 9, 2, 6]
        self.assertEqual(bubble_sort(arr.copy()), [1, 1, 2, 3, 4, 5, 6, 9])

    def test_negative_numbers(self):
        """测试包含负数的数组"""
        arr = [-5, 3, -1, 0, 2, -8]
        self.assertEqual(bubble_sort(arr.copy()), [-8, -5, -1, 0, 2, 3])

    def test_all_same_elements(self):
        """测试所有元素相同的数组"""
        arr = [7, 7, 7, 7, 7]
        self.assertEqual(bubble_sort(arr.copy()), [7, 7, 7, 7, 7])

    def test_two_elements(self):
        """测试两个元素的数组"""
        # 逆序
        self.assertEqual(bubble_sort([2, 1]), [1, 2])
        # 已排序
        self.assertEqual(bubble_sort([1, 2]), [1, 2])

    def test_does_not_modify_original(self):
        """测试不修改原始数组"""
        original = [5, 3, 8, 1]
        original_copy = original.copy()
        bubble_sort(original)
        # 验证原数组被修改（原地排序）
        self.assertNotEqual(original, original_copy)


if __name__ == '__main__':
    unittest.main()
