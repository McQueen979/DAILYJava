public class WhileLoopSum {
    public static void main(String[] args) {
        int i = 1;
        int oddSum = 0; // 奇数和
        int evenSum = 0; // 偶数和
        while (i <= 100) {
            if (i % 2 == 0) {
                evenSum += i; // 偶数累加
            } else {
                oddSum += i; // 奇数累加
            }
            i++;
        }
        System.out.println("奇数和为：" + oddSum);
        System.out.println("偶数和为：" + evenSum);
    }
}

