import java.util.*;
class Pr01_maxNumber{
    public static int maxNumber(int arr[], int size){
        int max = arr[0];
        for(int i = 0;i<size; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int size = 5;
        int arr[] = {121,12,113,34,65};
        System.out.println(maxNumber(arr,size));

    }
}