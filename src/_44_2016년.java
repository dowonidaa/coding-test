import java.time.LocalDate;

public class _44_2016년 {

    public static void main(String[] args) {

        String solution = Solution.solution(1, 1);
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static String solution(int a, int b) {
            int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

            int day = b;
            for (int i = 0; i < a-1; i++) {
                day += month[i];
            }

            int index = (day + 4)  % 7;

            return dayOfWeek[index];


//            LocalDate date = LocalDate.of(2016, a, b);
//            String substring = date.getDayOfWeek().toString().substring(0, 3);
//            System.out.println("substring = " + substring);



        }

    }
}

