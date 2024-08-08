public class _31_이상한문자만들기 {

    public static void main(String[] args) {
        String solution = Solution.solution("    yYyY   yyYyyYyy Y  YY   ");
        String solution2 = Solution.solution2("    yYyY   yyYyyYyy Y  YY   ");
        System.out.println("solution = " + solution);
        System.out.println("solution2 = " + solution2);
    }
    static class Solution {
        public static String solution(String s) {
            char[] chars = s.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 32) {
                    count = 0;
                    stringBuilder.append(chars[i]);
                } else {
                    if (count % 2 == 0) {
                        stringBuilder.append(String.valueOf(chars[i]).toUpperCase());
                        count++;
                    } else {
                        stringBuilder.append(String.valueOf(chars[i]).toLowerCase());
                        count++;
                    }
                }
            }
            return stringBuilder.toString();
        }
        public static String solution2(String s) {
            StringBuilder answer = new StringBuilder();
            String[] split = s.split("");
            int count = 0;
            for (String string : split) {
                count = string.equals(" ")? 0 : count+1;
                answer.append(count % 2 == 0 ? string.toLowerCase() : string.toUpperCase());
            }
            return answer.toString();
        }
    }
}
