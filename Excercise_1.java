import java.util.Scanner;

public class Excercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        double pi = 3.14;
        double S;
        System.out.println("nhap ban kinh: ");
        r = Double.parseDouble(sc.nextLine());
        S = pi*r*r;
        System.out.printf("dien tich hinh tron la: &d,S");
    }
}
