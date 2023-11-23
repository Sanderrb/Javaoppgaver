import java.util.Scanner;

public class Skuddår {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int år = scanner.nextInt();

        if (år % 4 == 0) {
            if (år % 100 == 0) {
                if (år % 400 == 0) {
                    System.out.println("Året er et skuddår");
                }
                else {
                    System.out.println("Året er ikke et skuddår");
                }
            }
            else {
                System.out.println("Året er et skuddår");
            }
        }
        else {
            System.out.println("Året er ikke et skuddår");
        }





        int[] testSkuddår = {100, 400, 450, 2000, 1600, 3200};
        System.out.println("\nTestdatasett");

        for (int testÅr : testSkuddår){
        if (testÅr % 4 == 0) {
            if (testÅr % 100 == 0) {
                if (testÅr % 400 == 0) {
                    System.out.println(testÅr + ": Året er et skuddår");
                }
                else {
                    System.out.println(testÅr + ": Året er ikke et skuddår");
                }
            }
            else {
                System.out.println(testÅr + ": Året er et skuddår");
            }
        }
        else {
            System.out.println(testÅr + ": Året er ikke et skuddår");
        }
        }



    }
}
