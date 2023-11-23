import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn lengden i tommer");

        double tommer = scanner.nextDouble();
        double centimeter = tommer*2.54;

        System.out.println(tommer +" tilsvarer " +centimeter +"cm");

        //test datasett

        double[] testTommer = {5, 10, 15, 20};
        System.out.println("\nTestdatasett:");

        for (double testTomme : testTommer) {
            double testCentimeter = testTomme *2.54;
            System.out.println(testTomme+" tommer tilsvarer " + testCentimeter + " cm");

        }



    }
}