import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _39_두개뽑아서더하기 {

    public static void main(String[] args) {


    }

    static class Solution {
        public static int[] solution(int[] numbers) {
            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < numbers.length-1; i++) {
                for (int j = i+1; j < numbers.length; j++) {
                    set.add(numbers[i] + numbers[j]);
                }
            }

            return set.stream().mapToInt(Integer::intValue).toArray();
        }

    }
}

