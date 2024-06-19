import java.util.ArrayList;

public class pr03_RotateArray1Time {
    static int rotate(int[] arr, int size){
        int temp = arr[0];
        for(int i = 1; i<size; i++){
            arr[i-1] = arr[i];
        }
        arr[size-1] = temp;
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int size = 5;
        rotate(arr, size);
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
