import java.util.Scanner;

/**
 * @author Таня
 *         Created by Таня on 03.12.2017.
 */
public class Base {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Chislo 1: ");
        double i = scn.nextDouble();
        System.out.println("Chislo 2: ");
        double n = scn.nextDouble();
        double s = i + n;
        System.out.println("Summa: "+ s);
        //     System.err.println("Error(");
        scn.close();
    }
}
