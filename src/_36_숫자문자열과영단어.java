public class _36_숫자문자열과영단어 {

    public static void main(String[] args) {
        int solution = Solution.solution("one4seveneight");
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(String s) {
            String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for (int i = 0; i < words.length; i++) {
                if (s.contains(words[i])) {
                    s = s.replaceAll(words[i], String.valueOf(i));
                }
            }

            return Integer.parseInt(s);
        }
    }
}

