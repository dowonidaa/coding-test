import java.sql.PreparedStatement;

public class 두정수사이의합_12 {

    public static void main(String[] args) {
        long solution = Solution.solution(0, 10_000_000);
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static long solution(int a, int b) {

            long sum = 0 ;
            for (long i = Math.min(a, b); i <= Math.max(a, b); i++) {
                sum += i;
            }
            return sum;
        }
    }


}
