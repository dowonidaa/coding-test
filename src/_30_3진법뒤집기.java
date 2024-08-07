public class _30_3진법뒤집기 {

    public static void main(String[] args) {
        int solution = Solution.solution(1000000000);
        System.out.println("solution = " + solution);
    }
    static class Solution {
        public static int solution(int n) {
            StringBuilder num = new StringBuilder();
            while (n != 0) {
                num.append(n % 3);
                n = n / 3;
            }
            return Integer.parseInt(num.toString(), 3);
        }
    }
}
