import java.util.Scanner;

/**
 * @author Таня
 *         Created by Таня on 03.12.2017.
 */
public class Base {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("1 калькулятор , 2 Массив слов");
        int c = scn.nextInt();
        switch (c){
            case 1: {
                //калькулятор
                System.out.println("Chislo 1: ");
                double i = scn.nextDouble();
                System.out.println("Vjberi Operation ");
                char d = scn.next().charAt(0);
                System.out.println("Chislo 2: ");
                double n = scn.nextDouble();
                switch (d){
                    case '+': System.out.printf("Summa: %.4f",i+n);
                        break;
                    case '-': System.out.printf("Raznica: %.4f",i-n);
                        break;
                    case '/': System.out.printf("Chastnoe: %.4f",i/n);
                        break;
                    case '*': System.out.printf("Proizvedenie: %.4f",i*n);
                        break;
                }
                 break;}
            case 2: {
                //массив
                System.out.println("Введите длину массива ");
                int d = scn.nextInt();
                int max=0;
                String myArray[]= new String[d];
                System.out.println("Введите слово ");
                for (int l=0; l<myArray.length; l++){
                    String m= scn.nextLine();
                    myArray[l]=m;
                    int y=m.length(); //подсчитывает кол-во букв в слове
                    if (y>max) {max=y; }// ищем максимальную длину
                }
                System.out.print ("Весь массив:");
                for (int l= 0; l<myArray.length; l++) {
                    System.out.print (" " + myArray[l]); // Выводим на экран, полученный массив
                }
                System.out.println();
                System.out.println("Самое длинное слово состоит из "+ max +" букв"); //Выводим на экран колво букв в самом длинном слове
                break;}
                }

        scn.close();
    }
}
