public class FactorialSum {

    public static void main(String[] args) {
        int n = 5;
        long sum = calculateFactorialSum(n);
        System.out.println("1! + 2! + 3! + 4! + 5! = " + sum); // 输出：153
    }

    /**
     * 计算从1!到n!的和
     * 该方法使用循环来累加各个数的阶乘
     */
    public static long calculateFactorialSum(int n) {
        long totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += factorial(i); // 调用递归函数计算i的阶乘并累加
        }
        return totalSum;
    }

    /**
     * 递归计算阶乘函数
     * 基准条件：n为0或1时，阶乘为1
     * 递归步骤：n! = n * (n-1)!
     */
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}