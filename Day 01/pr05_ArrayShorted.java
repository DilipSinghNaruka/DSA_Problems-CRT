public class pr05_ArrayShorted {
    static boolean isShorted(int arr[], int size) {
        int count = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i - 1] > arr[i]) {
                count++;
            }
        }
        if (count > 0) {
            return false;
        } else {
            return true;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int size = 6;
        System.out.println(isShorted(arr, size));
    }
}
