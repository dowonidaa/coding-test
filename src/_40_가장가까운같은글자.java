import java.util.Arrays;

public class _40_가장가까운같은글자 {

    public static void main(String[] args) {
        int[] solution = Solution.solution("banana");
        System.out.println("solution = " + Arrays.toString(solution));

    }

    static class Solution {
        public static int[] solution(String s) {
            int[] answer = new int[s.length()];
            String[] split = s.split("");
            String str = "";
            for (int i = 0; i < s.length(); i++) {
                int beforeIndex = str.lastIndexOf(split[i]);
                System.out.println("beforeIndex = " + beforeIndex);
                str += split[i];
                int lastIndex = str.lastIndexOf(split[i]);
                if (beforeIndex == -1) {
                    answer[i] = beforeIndex;
                } else {
                    answer[i] = lastIndex - beforeIndex;
                }
            }
            return answer;
        }

    }
}

