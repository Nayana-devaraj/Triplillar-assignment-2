package module6;

import java.util.Arrays;

public class p2Reverse {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        for(int i= arr.length-1;i>=0;i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
