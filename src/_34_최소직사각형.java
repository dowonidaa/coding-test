import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _34_최소직사각형 {

    public static void main(String[] args) {

        Solution.solution(new int[][]{{14,4},{19,6},{6,16},{18,7},{7,11}});
    }
    static class Solution {
        public static int solution(int[][] sizes) {
            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i][0] - sizes[i][1] < 0) {
                    int a = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = a;
                }
            }
            int[] w = new int[sizes.length];
            int[] h = new int[sizes.length];

            for (int i = 0; i < sizes.length; i++) {
                w[i]= sizes[i][0];
                h[i]= sizes[i][1];
            }

            int maxW = Arrays.stream(w).max().getAsInt();
            int maxH = Arrays.stream(h).max().getAsInt();
            return maxW * maxH;
        }
    }
    public static int solution2(int[][] sizes) {
        int w = 0;
        int h = 0;
        for (int[] size : sizes) {
            h = Math.max(h, Math.max(size[0], size[1]));
            w = Math.max(w, Math.min(size[0], size[1]));
        }
        return h * w;
    }
}

