package bitwise;

public class ExclusiveOR {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 6, 10, 5, 5};
        int a = 0;
        for (int i : arr) {
            a = a ^ i;
        }
        int m = a & (~a + 1);
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & m) == 0) {
                x ^= arr[i];
            }
        }
        System.out.println(x + "---" + (x^a));
    }

}
