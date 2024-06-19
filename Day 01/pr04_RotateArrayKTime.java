
public class pr04_RotateArrayKTime {
    static int rotate(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        start = 0;
        end= arr.length-1-k;
        while (start < end ) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        start = arr.length-k;
        end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3;
        rotate(arr, k);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
