import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _24_문자열내림차순으로배치하기 {

    public static void main(String[] args) {
        String solution = Solution.solution("abGAcdC");
        System.out.println("args = " + solution);
    }

    static class Solution {
        public static String solution(String s) {
            char[] charArray = s.toCharArray();
            Arrays.sort( charArray);
            return new StringBuilder(new String(charArray)).reverse().toString();

        }
    }
}
