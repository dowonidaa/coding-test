public class _50_기사단의무기 {

    public static void main(String[] args) {

        int solution = Solution.solution(100000, 3, 2);
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(int number, int limit, int power) {
            int answer = 0;
            for (int i = 1; i <=number ; i++) {
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
                if (count <= limit) {
                    answer += count;
                } else {
                    answer += power;
                }

            }

            return answer;
        }



    }


}

