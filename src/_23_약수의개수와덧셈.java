public class _23_약수의개수와덧셈 {

    public static void main(String[] args) {
        int solution = Solution.solution(13, 17);
        System.out.println("solution = " + solution);

    }

    static class Solution {
        public static int solution(int left, int right) {
            int answer = 0;
            for (int i = left; i <= right; i++) {
                 int sqrt = (int)Math.sqrt(i);
                 int count = 0;
                for (int j = 1; j <= sqrt; j++) {
                    if (i % j == 0) {
                        count++;
                        if (j != i / j) {
                            count++;
                        }
                    }
                }
                answer += (count % 2 == 0) ? i :  -i;
            }
            return answer;
        }
    }
}
