public class Addition {
    
    /**
     * 两个整数相加
     */
    public static int add(int a, int b) {
        return a + b;
    }
    
    /**
     * 两个浮点数相加
     */
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        // 整数加法示例
        int num1 = 10;
        int num2 = 20;
        int intResult = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + intResult);
        
        // 浮点数加法示例
        double num3 = 5.5;
        double num4 = 3.7;
        double doubleResult = add(num3, num4);
        System.out.println(num3 + " + " + num4 + " = " + doubleResult);
        
        // 从命令行参数读取数字进行加法
        if (args.length >= 2) {
            try {
                int arg1 = Integer.parseInt(args[0]);
                int arg2 = Integer.parseInt(args[1]);
                int argResult = add(arg1, arg2);
                System.out.println("命令行参数计算: " + arg1 + " + " + arg2 + " = " + argResult);
            } catch (NumberFormatException e) {
                System.out.println("请输入有效的整数作为命令行参数");
            }
        } else {
            System.out.println("提示: 可以传入两个整数作为命令行参数进行加法运算");
            System.out.println("用法: java Addition <数字1> <数字2>");
        }
    }
}
