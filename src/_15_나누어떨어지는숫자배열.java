import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_나누어떨어지는숫자배열 {

    public static void main(String[] args) {
    }


    static class Solution {
        public static int[] solution(int[] arr, int divisor) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    list.add(arr[i]);
                }
            }
            if (list.isEmpty()) {
                return new int[]{-1};
            }
///////////////////////////////////////////////////////
            int[] array = Arrays.stream(arr).filter(a -> {
                        return a % divisor == 0;
                    }
            ).sorted().toArray();
///////////////////////////////////////////////////////////////
            int[] answer = Arrays.stream(arr).filter(a -> {
                return a % divisor == 0;
            }).toArray();
            if (answer.length == 0) {
                return new int[]{-1};
            }
            Arrays.sort(answer);
            return answer;
        }
    }
}
