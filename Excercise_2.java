import java.util.Scanner;

public class Excercise_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double sothunhat;
        double sothuhai;
        System.out.println("nhap so thu nhat (firstNumber): ");
        sothunhat = Double.parseDouble(sc.nextLine());
        System.out.println("nhap so thu hai (secondNumber");
        sothuhai =  Double.parseDouble(sc.nextLine());
        System.out.println("--Ket qua--");
        System.out.printf("tong hai: %d", sothunhat+sothuhai);
        System.out.printf("hieu hai: %d",sothunhat-sothuhai);
        System.out.printf("tich hai: %d",sothunhat*sothuhai);
        System.out.printf("thuong: %d",sothunhat/sothuhai);
        System.out.printf("Phan du: %d",sothunhat%sothuhai);
    }
}
