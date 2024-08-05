import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 음양더하기_16 {

    public static void main(String[] args) {

    }

    static class Solution {
        public static int solution(int[] absolutes, boolean[] signs) {
           int answer = 0;
            for (int i = 0; i < absolutes.length; i++) {
                if (signs[i]) {
                    answer += absolutes[i];
                } else {
                    answer -= absolutes[i];
                }
            }
           return answer;
        }
    }
}
