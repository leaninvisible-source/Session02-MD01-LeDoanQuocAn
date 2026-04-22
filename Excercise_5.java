import java.util.Scanner;

public class Excercise_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double cannang;
        double chieucao;
        System.out.println("nhap can nang: ");
        cannang = Double.parseDouble(sc.nextLine());
        System.out.println("nhap chieu cao: ");
        chieucao = Double.parseDouble(sc.nextLine());
        System.out.printf("BMI: %d", cannang/chieucao);
    }
}
