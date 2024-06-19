public class pr06_RotatedShortedArray {
    static boolean isShorted(int arr[], int size) {
        int count = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i - 1] > arr[i]) {
                count++;
            }
        }
        if(arr[0]<arr[size-1]){
            count++;
        }

        if (count > 1) {
            return false;
        } else {
            return true;
        }


    }
    public static void main(String[] args) {
        int arr[] = { 3,4,5,6,1,2 };
        int size = 6;
        System.out.println(isShorted(arr, size));
    }
}
