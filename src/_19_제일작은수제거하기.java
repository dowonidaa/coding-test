public class _19_제일작은수제거하기 {

    public static void main(String[] args) {
        int[] solution = Solution.solution(new int[]{2, 3, 6,5, 10, 1});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    static class Solution {
        public static int[] solution(int[] arr) {
            if (arr.length == 1) {
                arr[0] = -1;
                return arr;
            } else {
                int minIndex = 0;
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < arr[minIndex]) {
                        minIndex = i;
                    }
                }
                int[] answer = new int[arr.length - 1];
                for (int i = 0, j = 0; i < arr.length; i++) {
                    if (i != minIndex) {
                        answer[j++] = arr[i];
                    }
                }
                return answer;
            }
        }
    }
}
