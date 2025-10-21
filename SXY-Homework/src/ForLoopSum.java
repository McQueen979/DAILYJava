public class ForLoopSum {
    public static void main(String[] args) {
        int oddSum = 0; // 奇数和
        int evenSum = 0; // 偶数和
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i; // 偶数累加
            } else {
                oddSum += i; // 奇数累加
            }
        }
        System.out.println("奇数和为：" + oddSum);
        System.out.println("偶数和为：" + evenSum);
    }
}
