import java.util.Scanner;

public class Excercise_6 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
float vantoc;
float thoigian;
float quangduong;
System.out.println("nhap van toc: ");
vantoc = Float.parseFloat(sc.nextLine());
System.out.println(("nhap thoi gian: "));
thoigian = Float.parseFloat(sc.nextLine());
quangduong = vantoc*thoigian;

System.out.printf("thời gian: %1f - vận tốc: %1f -> quãng đường= %f", thoigian,vantoc,quangduong);

}
}
