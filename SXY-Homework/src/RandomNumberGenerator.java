import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // 创建Random对象用于生成随机数
        Random random = new Random();

        // 初始化计数器和随机数变量
        int count = 0;
        int randomNumber;

        System.out.println("开始生成0-100的随机数...");
        // 使用do-while循环，至少执行一次
        do {
            // 生成0-100的随机数（包含0和100）
            randomNumber = random.nextInt(101);
            count++;
            System.out.println("第" + count + "次生成: " + randomNumber);
        } while (randomNumber != 88); // 当随机数不等于88时继续循环

        System.out.println("\n生成88成功！");
        System.out.println("总共循环了" + count + "次");
    }
}