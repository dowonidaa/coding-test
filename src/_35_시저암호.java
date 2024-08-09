import java.util.Arrays;

public class _35_시저암호 {

    public static void main(String[] args) {
        String solution = Solution.solution("AZaz ", 29);
        System.out.println("solution = " + solution);
    }
    static class Solution {
        public static String solution(String s, int n) {

            StringBuilder str = new StringBuilder();
            char[] charArray = s.toCharArray();
            for (char c : charArray) {
                System.out.println(1 + c);
                if ('A'<= c && c <='Z') {
                    str.append((char) (c + n > 'Z' ? c + n - 26 : c + n));
                } else if ('a' <= c && c <= 'z') {
                    str.append((char) (c + n > 'z' ? c + n - 26 : c + n));
                } else if (c != 32) {
                    str.append(" ");
                }
            }

            return str.toString();
        }
    }
}

