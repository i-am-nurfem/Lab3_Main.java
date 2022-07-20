package Q2;

import java.io.BufferedReader;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws InputMismatchException {

        String cname;
        float mW, hwW, fW;

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        Q2.Course c = new Q2.Course();

        System.out.println("Enter the first course name: ");
        cname = scan.nextLine();
        System.out.println("Enter the first course midterm grade: ");
        c.mtG = scan.nextInt();
        System.out.println("Enter the first course homework grade: ");
        c.hwG = scan.nextInt();
        System.out.println("Enter the first course final grade: ");
        c.finG = scan.nextInt();

        System.out.println(cname + " result: " + c.print());

        System.out.println("Enter the second course name: ");
        scan.nextLine();
        cname = scan.nextLine();
        System.out.println("Enter the second course midterm weight: ");
        //scan.nextLine();
        mW = scan.nextFloat();
        System.out.println("Enter the second course homework weight: ");
        //scan.nextLine();
        hwW = scan.nextFloat();
        System.out.println("Enter the second course final weight: ");
        //scan.nextLine();
        fW = scan.nextFloat();

        Q2.Course c2 = new Q2.Course(cname, mW, hwW, fW);

        System.out.println("Enter the second course midterm grade: ");
        scan.nextLine();
        c2.mtG = scan.nextInt();
        System.out.println("Enter the second course homework grade: ");
        scan.nextLine();
        c2.hwG = scan.nextInt();
        System.out.println("Enter the second course final grade: ");
        scan.nextLine();
        c2.finG = scan.nextInt();
        System.out.println(c2.name + " result: " + c2.print());
       
    }
}
