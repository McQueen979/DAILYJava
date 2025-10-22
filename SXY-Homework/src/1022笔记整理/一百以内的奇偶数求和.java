public static void main(string[] args){
	
// 1、 while
int i = 1;
int oddsum = 0 , evenSum = 0;
while (i <= 100) {
	if (i % 2 == 0) {
		evenSum += i;  // 偶数累加
	} else {
		oddSum += i;   // 奇数累加
	}
	i++;  // 更新循环变量
    }
	System.out.println("使用while循环计算结果：");
    System.out.println("1-100的奇数和为：" + oddSum);
    System.out.println("1-100的偶数和为：" + evenSum);
}

// 2、 for 循环
int oddSum = 0, evenSum = 0;
for (int i = 1; i <= 100; i++) {
    if (i % 2 == 0) {
        evenSum += i;  // 偶数累加
    } else {
        oddSum += i;   // 奇数累加
    }
} 
System.out.println("使用for循环计算结果：");
System.out.println("1-100的奇数和为：" + oddSum);
System.out.println("1-100的偶数和为：" + evenSum);
    }
}

// 3、分别处理奇数和偶数
int oddSum = 0, evenSum = 0;
for (int i = 1; i <= 100; i += 2) {
    oddSum += i;
}
for (int j = 2; j <= 100; j += 2) {
    evenSum += j;
}
System.out.println("使用for循环计算结果：");
System.out.println("1-100的奇数和为：" + oddSum);
System.out.println("1-100的偶数和为：" + evenSum);

// 4、Java 8 Stream API（函数式编程）
import java.util.stream.IntStream;

int oddSum = IntStream.rangeClosed(1, 100)
                     .filter(n -> n % 2 != 0)
                     .sum();

int evenSum = IntStream.rangeClosed(1, 100)
                      .filter(n -> n % 2 == 0)
                      .sum();