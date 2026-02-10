
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40, 50, 60, 70, 80, 90, 100, 110};
        int target = 70;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

}
