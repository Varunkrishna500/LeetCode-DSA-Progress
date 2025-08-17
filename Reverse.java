import java.util.Arrays;
public class Reverse {
  public static void rev(int[] arr) {
        int x = arr.length;
        int left = 0;
        int right = x - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        rev(arr);
        // prints as : 10 8 6 4 2
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //prints as : [10, 8, 6, 4, 2]
        System.out.print(Arrays.toString(arr));
    }
}
