package binary;

public class LocalMin {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1 ,9, 12, 0, 0, 3, 8};
        System.out.println(search(arr));
    }

    public static int search(int[] arr) {
        int length = arr.length;
        if (arr[0] < arr[1]) {
            return 0;
        }
        if (arr[length - 1] < arr[length - 2]) {
            return length - 1;
        }
        int left =0, right = length -1;
        while (left < right) {
            int mid = (right+left)/2;
            if (arr[mid] > arr[mid-1]) {
                right = mid -1;
            } else if (arr[mid] > arr[mid+1]) {
                left = mid +1;
            } else {
                return mid;
            }
        }
        return left;
    }

}
