import java.net.BindException;
import java.util.Scanner;

public class minArray {
    public static void main(String[] args) {
        int[] arr = {4, -9, 12, 7, 8, 1, 6, -9, -3, 52, 9, -9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index] +
                " in position : " + displayPos(arr));
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static String displayPos(int[] array) {
        String display=" ";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[minValue(array)]) {
                display += i+" ";
            }
        }
        return display;
    }

}
