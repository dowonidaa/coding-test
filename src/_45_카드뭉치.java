import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _45_카드뭉치 {

    public static void main(String[] args) {

    }

    static class Solution {
        public static String solution(String[] cards1,String[] cards2, String[] goal) {
            Queue<String> cardList1 = new LinkedList<>(Arrays.asList(cards1));
            Queue<String> cardList2 = new LinkedList<>(Arrays.asList(cards2));
            Queue<String> goalList = new LinkedList<>(Arrays.asList(goal));

            while (!goalList.isEmpty()) {
                String pollStr = goalList.poll();
                if (pollStr.equals(cardList1.peek())) {
                    cardList1.poll();
                } else if (pollStr.equals(cardList2.peek())) {
                    cardList2.poll();
                } else {
                    return "No";
                }
            }
            return "Yes";

        }

    }
}

