import java.util.Scanner;

public class Excercise_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;
        System.out.println("a = ");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("b = ");
        b = Double.parseDouble(sc.nextLine());
        System.out.println("c = ");
        c = Double.parseDouble(sc.nextLine());
        System.out.println("d = ");
        d = Double.parseDouble(sc.nextLine());
        System.out.printf("ket qua: %d", (a*d+b*c)/(b*d));
    }
}
