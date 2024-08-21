import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _49_덧칠하기 {

    public static void main(String[] args) {

        int solution = Solution.solution(8, 4, new int[]{2, 3, 6});
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(int n, int m, int[] section) {

            int answer = 1;
            int paint = section[0];
            for (int i = 1; i < section.length; i++) {
                if (paint + m - 1 < section[i]) {
                    answer++;
                    paint = section[i];
                }
            }
            return answer;
        }

        public static int solution2(int n, int m, int[] section) {
            Queue<Integer> list = new LinkedList<>();
            for (int i : section) {
                list.add(i);
            }
            int paint = list.peek() + m - 1;
            int answer = 1;
            while (!list.isEmpty()) {
                if (list.peek() <= paint) {
                    list.poll();
                } else {
                    answer++;
                    paint = list.peek() + m - 1;
                }
            }
            return answer;
        }

    }


}

