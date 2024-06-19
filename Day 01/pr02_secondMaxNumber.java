public class pr02_secondMaxNumber {
    public static int maxNumber(int arr[], int size) {
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            }else{
                if(arr[i]<max){

                    if(arr[i]>secondMax){
                        secondMax = arr[i];
                    }
                }
                
            }
        }
        return secondMax;

    }

    public static void main(String[] args) {
        int size = 5;
        int arr[] = { 121, 12, 113, 34, 1201 };
        System.out.println(maxNumber(arr, size));

    }
}
