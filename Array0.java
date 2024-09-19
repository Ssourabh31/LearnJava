public class Array0 {
    public static void main(String[] args) {
        int arr[] = {3,6,8,7};
        int arr2[] = new int[7];
        int[] arr3 = new int[5];

        for (int n: arr) {
            System.out.println(n);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
