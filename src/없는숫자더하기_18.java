public class 없는숫자더하기_18 {

    public static void main(String[] args) {
    }

    static class Solution {
        public static int solution(int[] numbers) {
            int answer =  45;
            for (int number : numbers) {
                answer -= number;
            }
            return answer;
        }
    }
}
