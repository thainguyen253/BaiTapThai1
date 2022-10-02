import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số phần tử của dãy Fibonacci: ");
        int n =sc.nextInt();
        int n1=0, n2=1, sum=0;
        if (n<1) {
            System.out.println("Bạn phải nhập 1 số nguyên dương lớn hơn 0");
        } else if (n<2) {
            System.out.println("0");
        } else
        System.out.print(n1+" "+n2);
        for (int i=2;i<n;i++) {
            sum = n1 + n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
    }
}