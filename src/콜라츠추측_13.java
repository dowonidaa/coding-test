public class 콜라츠추측_13 {

    public static void main(String[] args) {
        int solution = Solution.solution(16);
        System.out.println("solution = " + solution);
    }


    static class Solution {
        public static int solution(int num) {
            int count = 0;
            while (num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else if( num % 2 == 1) { // 626331 은 int 범위를 벗어나서 else로 하면 값이 다르게 나옴
                    num = num * 3 + 1;
                }
                count++;
                if (count == 500) {
                    return -1;
                }
            }
            return count;
        }
    }
}
