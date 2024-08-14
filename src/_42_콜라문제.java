public class _42_콜라문제 {

    public static void main(String[] args) {
        int solution = Solution.solution(2, 1, 20);
        System.out.println("solution = " + solution);

    }

    static class Solution {
        public static int solution(int a, int b, int n) {
            int answer = 0;

            while (n >= a) {
                answer += (n / a) * b;
                n = (n / a) * b + (n % a);
            }

            return answer;
        }

    }
}

