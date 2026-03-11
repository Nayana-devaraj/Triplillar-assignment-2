package module6;

import java.util.Arrays;

public class p1LargeSmall {
    public static void main(String[] args) {
        int numbers[]= {-10,24,50,-88,100};
        int large=numbers[0];
        int small=numbers[0];

        for(int i = 1;i< numbers.length;i++){
            if(numbers[i]>large){
                large=numbers[i];
            }
            else if(numbers[i]<small){
                small=numbers[i];
            }
        }
        System.out.println("Given array is : "+ Arrays.toString(numbers));
        System.out.println("Largest number is : "+large);
        System.out.println("Smallest number is : "+small);
    }
}
