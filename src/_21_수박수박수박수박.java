public class _21_수박수박수박수박 {

    public static void main(String[] args) {
        Solution.solution(11);
    }

    static class Solution {
        public static String solution(int n) {
            String answer = "";
            StringBuilder str = new StringBuilder();//
            StringBuffer str2 = new StringBuffer(); // 멀티쓰레드 환경에서 사용 ( 동기화)
            for (int i = 0; i < n; i++) {
                str.append(i % 2== 0 ? "수": "박");
                str2.append(i % 2 == 0 ? "수" : "박");
            }
            System.out.println(str2);
            System.out.println(str);
            return str.toString();
        }
    }
}
