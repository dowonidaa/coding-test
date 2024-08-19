import java.util.*;

public class _46_과일장수 {

    public static void main(String[] args) {
        int solution = Solution.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(int k, int m, int[] score) {

            int answer = 0;

            List<Integer> list = new LinkedList<>();
            for (int i : score) {
                list.add(i);
            }


            list.sort(Comparator.reverseOrder());

            while (list.size() >= m) {
                list.remove(0);
                list.remove(0);
                Integer min = list.remove(0);
                answer += min * m;
            }


            return answer;

        }

        public static int solution2(int k, int m, int[] score) {
            int answer = 0;

            Arrays.sort(score);

            for (int i = score.length; i >= m; i -= m) {
                answer += score[i - m] * m;
            }


            return answer;
        }
    }
}

