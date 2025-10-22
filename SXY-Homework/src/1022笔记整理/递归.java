// 递归计算  1! + 2! + 3! + 4! + 5!

public class FactorialSum {
	public static void main(String[] args) {
        int n = 5;
        long sum = calculateFactorialSum(n);
        System.out.println("1! + 2! + 3! + 4! + 5! = " + sum);
    }
	
	public static long calculateFactorialSum(int n) {
        long totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += factorial(i); // 调用递归函数计算i的阶乘并累加
        }
        return totalSum;
    }
	
	public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

/* 
计算 factorial(5) 时
展开为 5 * factorial(4)
展开为 5 * 4 * factorial(3)
展开为 5 * 4 * 3 * factorial(2)
展开为 5 * 4 * 3 * 2 * factorial(1)
展开为 5 * 4 * 3 * 2 * 1
*/

/*
栈溢出风险​：如果递归深度过大（例如计算一个非常大的数的阶乘），
不断的方法调用可能会导致栈内存溢出（StackOverflowError）。
对于阶乘计算，通常迭代方法更安全高效。
​性能考虑​：递归调用会有函数调用的开销。对于阶乘这种简单计算，迭代循环通常性能更好。
​数据类型限制​：阶乘值增长非常快。int 类型只能正确计算到 12!，long 类型大约能计算到 20!。
如果需要计算更大的阶乘，应使用 BigInteger 类
*/

// 纯迭代方法​：性能更好，避免了递归的栈溢出风险
public static long calculateFactorialSumIterative(int n) {
    long totalSum = 0;
    long currentFactorial = 1; // 用于保存当前数的阶乘
    for (int i = 1; i <= n; i++) {
        currentFactorial *= i; // 计算i!，利用前一次的结果 (i-1)! * i
        totalSum += currentFactorial;
    }
    return totalSum;
}

//​ 使用 BigInteger 处理大数​：当需要计算更大数的阶乘和时，这是必需的选择
import java.math.BigInteger;
public static BigInteger factorialSumWithBigInteger(int n) {
    BigInteger sum = BigInteger.ZERO;
    for (int i = 1; i <= n; i++) {
        sum = sum.add(factorialBigInteger(i));
    }
    return sum;
}
public static BigInteger factorialBigInteger(int n) {
    if (n == 0 || n == 1) {
        return BigInteger.ONE;
    } else {
        return BigInteger.valueOf(n).multiply(factorialBigInteger(n - 1));
    }
}