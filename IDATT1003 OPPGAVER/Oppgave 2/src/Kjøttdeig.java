public class Kjøttdeig {

    public static void main(String[] args){


        int A_vekt = 450;
        int B_vekt = 500;
        double A_pris = 35.9;
        double B_pris = 39.5;


        double kjøttdeigA_PPG = A_vekt / A_pris;
        double kjøttdeigB_PPG = B_vekt / B_pris;

        double A = kjøttdeigA_PPG;
        double B = kjøttdeigB_PPG;

        if (A>B)
            System.out.println("\nKjøttdeig B har billigere kilospris enn kjøttdeig A");
        else
            System.out.println("\nKjøttdeig A har billigere kilospris enn kjøttdeig B");

        System.out.println("\nI kjøttdeig A får man "+ A + " gram kjøttdeig per krone man betaler");
        System.out.println("I kjøttdeig B får man "+ B + " gram kjøttdeig per krone man betaler");




    }

}
