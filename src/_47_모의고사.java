import java.util.*;

public class _47_모의고사 {

    public static void main(String[] args) {

        Solution.solution(new int[]{1,3,2,4,2});

    }

    static class Solution {
        public static int[] solution(int[] answers) {
            int[] answer = {};
            int[] a = {1, 2, 3, 4, 5};
            int[] b = {2,1,2,3,2,4,2,5};
            int[] c = {3,3,1,1,2,2,4,4,5,5};
            List<Integer> answerlist = new ArrayList<>();
            int countA = 0;
            int countB = 0;
            int countC = 0;
            for (int i = 0; i < answers.length; i++) {
                if (a[i%5] == answers[i]) {
                    countA++;
                }
                if (b[i%8] == answers[i]) {
                    countB++;
                }
                if (c[i%10] == answers[i]) {
                    countC++;
                }
            }
            answerlist.add(countA);
            answerlist.add(countB);
            answerlist.add(countC);
            List<Integer> ans = new ArrayList<>();
            Integer max = Collections.max(answerlist);
            for (int i = 0; i < answerlist.size(); i++) {
                if (max == answerlist.get(i)) {
                    ans.add(i + 1);
                }
            }

            answer = new int[ans.size()];

            for (int i = 0; i < ans.size(); i++) {
                answer[i] = ans.get(i);
            }

            return answer;

        }

    }

    class Solution2 {
        public int[] solution(int[] answers) {
            int[] answer;
            int[] person1 = {1, 2, 3, 4, 5};
            int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            List<Integer> score = new ArrayList<>();
            List<Integer> ans = new ArrayList<>();
            score.add(0);
            score.add(0);
            score.add(0);

            for(int i = 0; i < answers.length; i++) {
                if(answers[i] == person1[i%5])
                    score.set(0, score.get(0)+1);
                if(answers[i] == person2[i%8])
                    score.set(1, score.get(1)+1);
                if(answers[i] == person3[i%10])
                    score.set(2, score.get(2)+1);
            }
            int max = Collections.max(score);
            for(int i = 0; i < 3; i++) {
                if(max == score.get(i)) {
                    ans.add(i+1);
                }
            }

            answer = new int[ans.size()];

            for(int i = 0; i < ans.size(); i++) {
                answer[i] = ans.get(i);
            }

            return answer;
        }
    }
}

