import java.util.Scanner;

public class isPrimeN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so n tu ban phim");
        int n= sc.nextInt();
        printPrime(n);


    }
    public static void printPrime(int x) {
        if (x<2) {
            System.out.println(" so ban nhap nho hon 2");
        }
        for (int i=2;i<=x;i++) {
            if (checkIsPrime(i)) {
                System.out.printf("%d \n",i);
            }
        }
    }
    public static boolean checkIsPrime(int n) {

        for (int i=2;i<=n/2;i++) {
            if (n%i==0) {
                return false;
            }
        } return true;
    }
}
