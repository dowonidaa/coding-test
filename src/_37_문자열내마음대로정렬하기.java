import java.util.Arrays;

public class _37_문자열내마음대로정렬하기 {

    public static void main(String[] args) {
        Solution.solution(new String[]{"sun", "bed", "cart"}, 1);

    }

    static class Solution {
        public static String[] solution(String[] strings,int n) {
            for (int i = 0; i <strings.length; i++) {
                strings[i] = strings[i].charAt(n) + strings[i];
            }
            Arrays.sort(strings);
            for (int i = 0; i <strings.length; i++) {
                strings[i] = strings[i].substring(1);
            }
            return strings;
        }
    }
}

