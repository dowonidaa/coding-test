import java.util.Arrays;

public class _38_K번째수 {

    public static void main(String[] args) {
        int[] ints = {1, 5,2,6,3,7,4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] solution = Solution.solution(ints, commands);
        int[] solution2 = Solution.solution2(ints, commands);
        for (int s : solution) {
            System.out.println("s = " + s);
        }

        for (int i : solution2) {
            System.out.println("i = " + i);
        }

    }

    static class Solution {
        public static int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            for (int i = 0; i < commands.length; i++) {
                int start = commands[i][0];
                int end = commands[i][1] - commands[i][0] + 1;

                int[] cut = new int[end];
                for (int j = 0; j < end; j++) {
                    cut[j] = array[start -1 + j];
                }
                Arrays.sort(cut);
                answer[i] = cut[commands[i][2]-1];
            }
            return answer;
        }

        public static int[] solution2(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            for (int i = 0; i < commands.length; i++) {
                int[] ints = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
                Arrays.sort(ints);
                answer[i] = ints[commands[i][2]-1];
            }
            return answer;
        }
    }
}

