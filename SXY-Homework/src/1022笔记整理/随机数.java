//生成 0-100 随机数，直到生成 88 为止，停止循环！

/* Random random = new Random();
Random random​：这是对象声明，声明了一个名为 random、类型为 Random 的变量。
new Random()​：这是对象实例化与初始化**的核心
	new 是Java的关键字，用于向内存（通常是堆内存）申请空间，根据 Random 类的结构创建对象
	Random() 是调用类的构造方法。构造方法负责为这个新分配的内存空间进行初始化工作
=​：这个赋值操作将新创建的对象的内存地址赋给之前声明的 random 变量。
从此，random 变量就成为了一个引用，指向那个实际的对象
*/

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();	// 创建Random对象用于生成随机数
        int count = 0;	// 初始化计数器和随机数变量
        int randomNumber;
        System.out.println("开始生成0-100的随机数...");
        
        // 使用do-while循环，至少执行一次
        do {
            randomNumber = random.nextInt(101);	// 生成0-100的随机数（包含0和100）
            count++;
            System.out.println("第" + count + "次生成: " + randomNumber);
        } while (randomNumber != 88); // 当随机数不等于88时继续循环
        
        System.out.println("\n生成88成功！");
        System.out.println("总共循环了" + count + "次");
    }
}

// 2、 使用 for 循环（无限循环+break！！！）
for (int count = 1; ; count++) {
    int randomNumber = random.nextInt(101);
    System.out.println("第" + count + "次生成: " + randomNumber);       
    if (randomNumber == 88) {
        System.out.println("生成88成功！循环次数: " + count);
        break; // 遇到88时退出循环
    }

// for ( ; randomNumber != 88 ; randomNumber = random.nextInt(101)){
