import java.util.Scanner;

public class oppgave1 {

    public static void main(String[] args) {

        System.out.println("Skriv inn to tall");
        Scanner scanner = new Scanner(System.in);
        int tall1 = scanner.nextInt();
        int tall2 = scanner.nextInt();

        for(int i= tall1; i <= tall2; i++) {
            for(int j=1; j<11; j++) {
                System.out.println(i*j);
            }


        }

    }


}