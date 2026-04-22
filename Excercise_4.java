import java.util.Scanner;

public class Excercise_4 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double chieu_rong;
        double chieu_cao;
        System.out.println("nhap chieu rong: ");
        chieu_rong = Double.parseDouble(sc.nextLine());
        System.out.println("nhap chieu cao: ");
        chieu_cao = Double.parseDouble(sc.nextLine());
        System.out.printf("dien tich = %d", chieu_cao*chieu_rong);
        System.out.printf("chu vi = ",(chieu_cao+chieu_rong)*2);
    }
}
