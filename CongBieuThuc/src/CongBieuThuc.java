import java.util.Scanner;

public class CongBieuThuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập 1 số ");
        int n = scanner.nextInt();
        int sum = 0 ;
        System.out.println("Biểu thức: ");
        for (int i = 1 ; i<=n ; i++){
            if (i<n) {
                System.out.print(" " + i + "*" + (i + 1) + " +");
            }
            else {
                System.out.println(" "+i +"*" +(i+1));
            }
        }
        for (int i = 1 ; i<=n ; i++){
            sum+=i*(i+1);
        }
        System.out.println("Tổng của biểu thức là: "+sum);


    }
}