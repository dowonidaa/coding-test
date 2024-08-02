public class 하샤드_11 {

    public static void main(String[] args) {
        boolean solution = Solution.solution(11);
        System.out.println("solution = " + solution);
    }

    static class Solution{
        public static boolean solution(int x) {
            int n = 0;
            int c = x;
            while (c > 0) {
                n += (c % 10);
                c = c / 10;
            }
            return x % n == 0;
        }
    }


}
