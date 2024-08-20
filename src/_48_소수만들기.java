import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _48_소수만들기 {

    public static void main(String[] args) {
        Solution.solution(new int[]{1, 2, 7, 6, 4});

    }

    static class Solution {
        public static int solution(int[] nums) {
            int answer = 0;

            for (int i = 0; i < nums.length-2; i++) {
                for (int j = i+1; j <nums.length-1 ; j++) {
                    for (int k = j+1; k < nums.length; k++) {
                        int sum = nums[i] + nums[j] + nums[k];
                        System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                        System.out.println("sum = " + sum);
                        boolean result = true;
                        for (int l = 2; l <= sum/2; l++) {
                            if (sum % l == 0) {
                                result = false;
                                break;
                            }
                        }
                        if (result) {
                            answer++;
                        }

                    }

                }

            }
            System.out.println("answer = " + answer);

            return answer;
        }

    }



}

