import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn et antall sekunder");
        int totalesekunder = scanner.nextInt();

        int timer = totalesekunder / 3600;
        int regjerendeSekunder = totalesekunder % 3600;
        int minutter = regjerendeSekunder / 60;
        int sekunder = regjerendeSekunder % 60;

        System.out.println("Tid: " + timer + " timer, " + minutter + " minutter, " + sekunder + " sekunder");


        int[] testSekunder = {2500, 4200, 7200, 350, 100000};
        System.out.println("\nTestdatasett:");
        for (int testTotalSekunder : testSekunder) {
            int testTimer = testTotalSekunder / 3600;
            int testRestSekunder = testTotalSekunder % 3600;
            int testMinutter = testRestSekunder / 60;
            int testSek = testRestSekunder % 60;
            System.out.println(
                    testTotalSekunder + " sekunder tilsvarer " + testTimer + " timer, " + testMinutter + " minutter, " + testSek + " sekunder");


        }
    }
}