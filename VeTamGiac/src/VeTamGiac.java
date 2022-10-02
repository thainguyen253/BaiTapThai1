import java.util.Scanner;

public class VeTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int cc = scanner.nextInt();
        for(int i = cc; i>=0 ; i--){
            for (int cr = i; cr>=1 ;cr--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}