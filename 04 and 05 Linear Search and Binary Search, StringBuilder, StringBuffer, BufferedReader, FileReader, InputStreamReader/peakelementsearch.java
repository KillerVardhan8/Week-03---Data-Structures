public class peakelementsearch {


    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return arr[mid];
            }

            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7,8,3,3,9,5};

        int peak = findPeak(arr);
        System.out.println("Peak element is: " + peak);
    }
}