package bitwise;

public class ExclusiveORKm {

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,6 ,3,3,3,3,3, 2,2,2,2,2,5,5,5,5,5};
        System.out.println(km(arr, 5));
    }

    public static int km(int[] arr, int m) {
        int[] a = new int[32];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 32; j++) {
                a[j] += (arr[i] >> j) & 1;
            }
        }
        int x = 0;
        for (int i = 0; i < 32; i++) {
            if (a[i] % m != 0) {
                x |= (1 << i);
            }
        }
        return x;
    }


}
