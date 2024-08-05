public class _16_음양더하기 {

    public static void main(String[] args) {

    }

    static class Solution {
        public static int solution(int[] absolutes, boolean[] signs) {
           int answer = 0;
            for (int i = 0; i < absolutes.length; i++) {
                if (signs[i]) {
                    answer += absolutes[i];
                } else {
                    answer -= absolutes[i];
                }
            }
           return answer;
        }
    }
}
