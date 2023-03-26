import java.util.Scanner;

public class inMang {
    public static void main(String[] args) {
        System.out.println("nhap n");
        Scanner sc1=new Scanner(System.in);
        int n= sc1.nextInt();

        int[] myArr= new int[n];
        intArr(myArr);
        printArr(myArr);



//        Scanner sc2= new Scanner(System.in);
//        for (int i=0;i<myArr.length;i++) {
//            System.out.printf("Nhap phan tu %d ",i,"  ");
//        myArr[i]=sc2.nextInt();
//        }
//        System.out.println("Mang da in");
//        for(int i=0;i<myArr.length;i++) {
//            System.out.printf("\nPhan tu thu " +i + " la " + myArr[i]);
//        }

}
public static void intArr(int arr[]) {
    Scanner sc2= new Scanner(System.in);
    for (int i=0;i<arr.length;i++) {
        System.out.printf("Nhap phan tu %d ",i,"  ");
        arr[i]=sc2.nextInt();
    }
}
public static void printArr(int[] arr) {
    System.out.println("Mang da in");
    for(int i=0;i<arr.length;i++) {
        System.out.printf("\nPhan tu thu " +i + " la " + arr[i]);
    }
}

}
