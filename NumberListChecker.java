import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 判断List集合中的元素是否都是数字的工具类
 */
public class NumberListChecker {

    /**
     * 判断传入的List集合是否都是数字
     * 
     * @param list 待检查的List集合
     * @return 如果所有元素都是数字则返回true，否则返回false
     */
    public static boolean isAllNumbers(List<?> list) {
        // 如果list为null或空，返回false
        if (list == null || list.isEmpty()) {
            return false;
        }

        // 遍历list中的每个元素
        for (Object obj : list) {
            // 如果元素为null，直接返回false
            if (obj == null) {
                return false;
            }
            
            // 检查元素是否为Number类型或其子类
            // Number的子类包括：Integer, Long, Double, Float, Short, Byte, BigDecimal, BigInteger等
            if (!(obj instanceof Number)) {
                // 如果不是Number类型，检查是否是字符串形式的数字
                if (obj instanceof String) {
                    if (!isNumericString((String) obj)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * 判断字符串是否是数字形式
     * 
     * @param str 待检查的字符串
     * @return 如果是数字形式返回true，否则返回false
     */
    private static boolean isNumericString(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        
        try {
            // 尝试将字符串转换为Double
            Double.parseDouble(str.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * 如果List中都是数字，返回处理后的结果（转换为Double列表）
     * 
     * @param list 待检查的List集合
     * @return 如果都是数字，返回Double类型的List；否则返回null
     */
    public static List<Double> getNumbersIfAllValid(List<?> list) {
        if (!isAllNumbers(list)) {
            return null;
        }

        List<Double> result = new ArrayList<>();
        for (Object obj : list) {
            if (obj instanceof Number) {
                result.add(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                result.add(Double.parseDouble(((String) obj).trim()));
            }
        }

        return result;
    }

    // 测试示例
    public static void main(String[] args) {
        // 测试1: 全是Integer数字
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("测试1 - 全是Integer: " + isAllNumbers(list1));
        System.out.println("转换结果: " + getNumbersIfAllValid(list1));

        // 测试2: 混合Number类型
        List<Number> list2 = Arrays.asList(1, 2.5, 3L, 4.0f);
        System.out.println("\n测试2 - 混合Number类型: " + isAllNumbers(list2));
        System.out.println("转换结果: " + getNumbersIfAllValid(list2));

        // 测试3: 包含字符串数字
        List<String> list3 = Arrays.asList("1", "2.5", "3", "4.0");
        System.out.println("\n测试3 - 字符串数字: " + isAllNumbers(list3));
        System.out.println("转换结果: " + getNumbersIfAllValid(list3));

        // 测试4: 包含非数字
        List<Object> list4 = Arrays.asList(1, 2, "abc", 4);
        System.out.println("\n测试4 - 包含非数字: " + isAllNumbers(list4));
        System.out.println("转换结果: " + getNumbersIfAllValid(list4));

        // 测试5: 空列表
        List<Integer> list5 = new ArrayList<>();
        System.out.println("\n测试5 - 空列表: " + isAllNumbers(list5));
        System.out.println("转换结果: " + getNumbersIfAllValid(list5));

        // 测试6: 包含null
        List<Object> list6 = Arrays.asList(1, 2, null, 4);
        System.out.println("\n测试6 - 包含null: " + isAllNumbers(list6));
        System.out.println("转换结果: " + getNumbersIfAllValid(list6));
    }
}
