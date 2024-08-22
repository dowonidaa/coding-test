import java.util.Arrays;

public class _51_로또의초고순위와최저순위 {

    public static void main(String[] args) {
        int[] solution = Solution.solution(new int[]{1,2,3,4,5,6}, new int[]{7,8,9,10,11,12});
        System.out.println(Arrays.toString(solution));
    }

    static class Solution {
        public static int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int[] array = Arrays.stream(lottos).filter(i -> i != 0).toArray();
            int count = 0;
            for (int winNum : win_nums) {
                for (int i : array) {
                    if (i == winNum) {
                        count++;
                    }
                }
            }
            for (int i = 1; i <=6; i++) {
                if (count == 0) {
                    answer[1] = 6;
                }
                if (count == i) {
                    answer[1] = 6 - i + 1;
                }
            }


            count += lottos.length- array.length;
            for (int i = 1; i <= 6; i++) {
                if (count == 0) {
                    answer[0] = 6;
                }
                if (count == i) {
                    answer[0] = 6-i +1;
                }
            }


            return answer;
        }


    }


}

