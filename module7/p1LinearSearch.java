package module7;

public class p1LinearSearch {
    public static void main(String[] args) {
        int []arr={18,20,45,77,78,1};
        int target=77;
        boolean found=false;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found=true;
                index=i;
                break;
            }
        }
        if(found){
            System.out.println("Element "+target+ " is found at index "+index);
        }
        else{
            System.out.println("Element "+target+ " not found");
        }
    }
}
