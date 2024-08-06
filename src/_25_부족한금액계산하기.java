import java.util.Arrays;

public class _25_부족한금액계산하기 {

    public static void main(String[] args) {
        long solution = Solution.solution(3, 20, 4);
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static long solution(int price, int money, int count) {
            for (int i = 1; i <= count; i++) {
                    money -= price * i;
            }
            return money > 0 ? 0 : -money;
        }
    }
}
