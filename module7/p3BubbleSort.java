package module7;

import java.util.Arrays;

public class p3BubbleSort {
    public static void bubbleSort(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr={40,80,20,30,100};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
