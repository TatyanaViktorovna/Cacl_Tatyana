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
        System.out.println("Chislo 2: ");
        double n = scn.nextDouble();
        double s = i + n;
        System.out.printf("Summa: %.4f",s); // сумма с округлением до 4 знака после запятой
        //System.out.println("Summa: "+ s); // сумма без округления
        //     System.err.println("Error(");
        scn.close();
    }
}
