import java.util.*;

public class _43_명예의전당1 {

    public static void main(String[] args) {
        int[] ints = {10, 100, 20, 150, 1, 100, 200};

        int[] solution = Solution.solution(3, ints);
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }

    static class Solution {
        public static int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];
            List<Integer> rank = new ArrayList<>();

            for (int i = 0; i < score.length; i++) {
                rank.add(score[i]);
                rank.sort(Collections.reverseOrder());
                List<Integer> list = rank.subList(0, Math.min(k, rank.size()));
                answer[i] = Collections.min(list);
            }

            return answer;
        }

        public static int[] solution2(int k, int[] score) {
            int[] answer = new int[score.length];

            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

            int temp = 0;

            for(int i = 0; i < score.length; i++) {

                priorityQueue.add(score[i]);
                if (priorityQueue.size() > k) {
                    priorityQueue.poll();
                }

                answer[i] = priorityQueue.peek();
            }

            return answer;        }

    }
}

