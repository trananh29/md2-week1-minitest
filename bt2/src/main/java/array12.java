public class array12 {
    public static void main(String[] args) {
        int[] myArray={1,2,3,4,5,6,7,8,9,10};
        System.out.printf("Max of array myArray is %d \n",maxArray(myArray));
        System.out.printf("Sum of array my Array is %d \n",sumArray(myArray));
    }
    public static int sumArray(int[] array){
        int sum=0;
        for (int i=0;i<array.length-1;i++) {
            sum += array[i];
        }
        return sum;
    }
    public static int maxArray(int[] array) {
        int max=array[0];
        for (int i=0; i< array.length;i++) {
            if (max < array[i]) {
                max =array[i];
            }
        }
        return max;
    }
}
