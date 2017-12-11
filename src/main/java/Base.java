import java.util.Scanner;

/**
 * @author Таня
 *         Created by Таня on 03.12.2017.
 */
public class Base {
    public static final void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Chislo 1: ");
        double i = scn.nextDouble();
        System.out.println("Operation 1 - '+', 2 - '-', 3 - '/', 4 - '*'");
        int d = scn.nextInt();

        System.out.println("Chislo 2: ");
        double n = scn.nextDouble();
        switch (d){
            case 1: System.out.printf("Summa: %.4f",i+n);
                break;
            case 2: System.out.printf("Raznica: %.4f",i-n);
                break;
            case 3: System.out.printf("Chastnoe: %.4f",i/n);
                break;
            case 4: System.out.printf("Proizvedenie: %.4f",i*n);
                break;
        }
//        //System.out.println("Summa: "+ s); // сумма без округления
        //     System.err.println("Error(");
        scn.close();
    }
}
