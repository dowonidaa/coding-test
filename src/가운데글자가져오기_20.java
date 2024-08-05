public class 가운데글자가져오기_20 {

    public static void main(String[] args) {
        String solution = Solution.solution("abcd");
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static String solution(String s) {
            String answer = "";
            int length = s.length();
            if (length % 2 == 1) {
                return s.substring(length / 2, length / 2 + 1);
            } else {
                return s.substring(length / 2 - 1, length / 2 + 1);
            }
        }
    }
}
