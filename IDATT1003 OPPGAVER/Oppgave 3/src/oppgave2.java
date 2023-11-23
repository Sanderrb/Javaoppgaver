import java.util.Scanner;

public class oppgave2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn et tall.");
        int primtall = scanner.nextInt();

        for (int count = 2; count < primtall; count++) {
            if (primtall % count == 0) {
                System.out.println("Tallet er ikke et primtall");
                break;

            }
            if (count == primtall - 1) {
                System.out.println("Tallet er et primtall");
            }
        }
    }
}
