
public class oppgave2 {


    public static void main(String[] args) {

        int[][] testTimes = {
                {4, 30, 15},
                {0, 15, 35},
                {2, 40, 15}
        };

        System.out.println("Testdatasett:");
        for (int[] time : testTimes) {
            int totalSeconds = time[0] * 3600 + time[1] * 60 + time[2];
            System.out.println(time[0] + " timer, " + time[1] + " minutter, " + time[2] + " sekunder tilsvarer " + totalSeconds + " sekunder");

        }



    }
}