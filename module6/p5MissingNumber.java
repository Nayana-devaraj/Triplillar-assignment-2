package module6;

public class p5MissingNumber {
    public static void main(String[] args) {
        int num[]={ 1,2,3,4,5,6,7,9,10,11,12,13,14,15};
        int n1=MissingNumber(num,15);
        System.out.println(n1);

    }
    public static int MissingNumber(int num[], int n ){
        int Sum=n*((n+1)/2);
        int actualSum=0;

        for(int i:num){
            actualSum+=i;
        }
        return Sum-actualSum;

    }
}
