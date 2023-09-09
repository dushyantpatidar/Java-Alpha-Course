public class apn146 {
    public static boolean ArrayQue1(int arr[]) {
        boolean twice = false;
        int CurrElement;
        for (int i = 0; i < arr.length; i++) {
            CurrElement = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (CurrElement == arr[j]) {
                    twice = true;
                }
            }
        }
        return twice;
    }

    public static void main(String[] args) {
        // int arr[] = {1,2,3,1};// true
        // int arr[] ={1, 2, 3, 4}; // false
        int arr[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        System.out.println(ArrayQue1(arr));
    }
}
