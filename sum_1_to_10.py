# 1到10的累计方法

def sum_1_to_10():
    """计算1到10的累加和"""
    total = 0
    for i in range(1, 11):
        total += i
    return total

# 也可以使用更简洁的方法
def sum_1_to_10_simple():
    """使用sum函数计算1到10的累加和"""
    return sum(range(1, 11))

# 或者使用数学公式
def sum_1_to_10_formula():
    """使用等差数列求和公式计算1到10的累加和"""
    n = 10
    return n * (n + 1) // 2

if __name__ == "__main__":
    result1 = sum_1_to_10()
    result2 = sum_1_to_10_simple()
    result3 = sum_1_to_10_formula()
    
    print(f"方法1（循环）结果: {result1}")
    print(f"方法2（sum函数）结果: {result2}")
    print(f"方法3（数学公式）结果: {result3}")
