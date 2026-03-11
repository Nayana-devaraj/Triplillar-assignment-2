package module6;

public class p4SecondLargest {
    public static int secondLargest(int[] a) {
        int max1 = 0;
        int max2 = 0;

        if (a[0] > a[1]) {
            max1 = a[0];
            max2 = a[1];
        }
        else {
            max1 = a[1];
            max2 = a[0];
        }
        for (int i = 2; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        int[] a = {20, 50, 70, 100, 67, 17, 25};
        System.out.println(secondLargest(a));
    }
}


