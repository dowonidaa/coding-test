public class _32_삼총사 {

    public static void main(String[] args) {
        int solution = Solution.solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println("solution = " + solution);
    }
    static class Solution {
        public static int solution(int[] number) {
            int answer = 0;
            for (int i = 0; i < number.length-2; i++) {
                for (int j = i+1; j < number.length-1; j++) {
                    for (int k = j+1; k < number.length; k++) {
                        if (number[i] + number[j] + number[k] == 0) {
                            System.out.println(number[i] + ", "+ number[j] +"," +number[k] );
                            answer++;
                        }
                    }
                }
            }
            return answer;
        }
    }
}
