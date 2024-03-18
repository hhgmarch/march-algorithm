package binary;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 10, 12};
        System.out.println(search(arr, -1));
        int[] arr2 = {1, 1, 2, 3, 3, 3, 5, 5, 6, 10, 12};
        System.out.println(search2( arr2, 2));
    }

    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int search2(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                if (left == right) {
                    return left;
                }
                right = mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            }
        }
        return -1;
    }


}
