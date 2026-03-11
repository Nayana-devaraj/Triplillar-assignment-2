package module7;

public class p2BinarySearch {
    public static void main(String[] args) {
        int []arr={5,10,15,20,25,30,35,40,45};
        int target=40;
        int low=0;
        int high=arr.length-1;
        int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                index=mid;
                break;
            } else if (arr[mid]<target) {
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        if(index!=-1){
            System.out.println("Element "+target+ " is found at index "+index);
        }
        else{
            System.out.println("target Not found");
        }
    }
}
