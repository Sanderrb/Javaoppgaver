import java.util.Scanner;

public class oppgave11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn starttallet: ");
        int tall1 = input.nextInt();

        System.out.print("Skriv inn sluttallet: ");
        int tall2 = input.nextInt();

        input.close();

        for (int i = tall1; i <= tall2; i++) {
            System.out.println("\n");
            for (int j = 1; j <= 10; j++) {
                int produkt = i * j;
                System.out.println(i + " x " + j + " = " + produkt);
            }
        }
    }
}
