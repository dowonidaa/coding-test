public class _33_크기가작은부분문자열 {

    public static void main(String[] args) {
        Solution.solution("10203", "15");
    }
    static class Solution {
        public static int solution(String t, String p) {
            int answer = 0;
            int i2 = Integer.parseInt(p);
            for (int i = 0; i < t.length()- p.length()+1; i++) {
                String substring = t.substring(i, i + p.length());
                System.out.println("substring = " + substring);
                int i1 = Integer.parseInt(substring);
                if (i1 <= i2) {
                    answer++;
                }
            }
            return answer;
        }
    }
}
