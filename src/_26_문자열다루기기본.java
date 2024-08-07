public class _26_문자열다루기기본 {

    public static void main(String[] args) {
        boolean solution = Solution.solution("0000110");
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static boolean solution(String s) {
            if (s.length() == 4 || s.length() == 6) {
                try {
                    Integer.parseInt(s);
                    return true;
                } catch (NumberFormatException e) {
                    return false;
                }
            } else return false;
        }
    }
}
