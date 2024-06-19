import java.util.HashSet;

public class pr07_UniqueNumber {

    public static void main(String[] args) {
        HashSet<Integer>arr = new HashSet<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(10);
        System.out.println(arr.size());
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
