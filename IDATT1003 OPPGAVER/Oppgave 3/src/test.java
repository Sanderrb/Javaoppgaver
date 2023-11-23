import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int slutt = scanner.nextInt();

        for(int i = start; i<= slutt; i++) {
            for(int j = 1; j<=10; j++) {
                System.out.println(i*j);

            }

        }

    }

}
