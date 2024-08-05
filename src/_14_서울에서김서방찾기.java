import java.util.Arrays;

public class _14_서울에서김서방찾기 {

    public static void main(String[] args) {
        String[] seoul = {"Jene", "Kim"};
        String solution = Solution.solution(seoul);
        System.out.println("solution = " + solution);
    }


    static class Solution {
        public static String solution(String[] seoul) {
            for (int i = 0; i < seoul.length; i++) {
                if (seoul[i].equals("Kim")) {
                    return "김서방은 " + i + "에 있다.";
                }
            }

            int i = Arrays.asList(seoul).indexOf("Kim");
            return "없다";


        }
    }
}
