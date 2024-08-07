public class _29_최대공약수와최소공배수 {

    public static void main(String[] args) {
    }

    static class Solution {
        public static int[] solution(int n, int m) {
            return new int[] {goc(n,m), n*m/goc(n,m)};
        }

        public static int goc(int n, int m) {
            while (m != 0) {
                int num = m;
                m = n % m;
                n = num;
            }
            return n;
        }
    }


}
