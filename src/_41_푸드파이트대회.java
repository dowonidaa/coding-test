public class _41_푸드파이트대회 {

    public static void main(String[] args) {
        String solution = Solution.solution(new int[]{1, 3, 4, 6});
        System.out.println("solution = " + solution);


    }

    static class Solution {
        public static String solution(int[] food) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < food.length; i++) {
                sb.append(String.valueOf(i).repeat(Math.max(0, food[i] / 2)));
            }
            return sb.toString() + "0" + sb.reverse().toString();
        }

    }
}

