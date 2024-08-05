public class 핸드폰번호가리기_17 {

    public static void main(String[] args) {
        String solution = Solution.solution("01000090001123");
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static String solution(String phone_number) {
            String regex = "\\d(?=\\d{4})";
            return phone_number.replaceAll(regex, "*");
        }
    }
}
