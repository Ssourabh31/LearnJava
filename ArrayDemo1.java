class Demo {
    
    // Demo() {
    //     System.out.println("This is Demo Class");
    // }
    // Above will also work

    public Demo() {
        System.out.println("This is Demo class constructor");
    }

    public void printArr(int[] arr) {
        for (int val : arr) {
            System.out.print(" "+val);
        }

        System.out.println();
    }

    public int[] reverseArray(int []arr) {
        int len = arr.length;
        int end = len - 1;
        int start = 0;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }

        return arr;
    }
}

public class ArrayDemo1 {
    public static void main(String[] args) {
        
        int arr1[] = {3,4,5,6};
        int resArr[] = new int[4];

        Demo d0 = new Demo();
        
        //Passing Array to Method
        d0.printArr(arr1);

        resArr = d0.reverseArray(arr1);

        System.out.println(" "+"Reverse of an Array: ");

        d0.printArr(resArr);
        
    }
}