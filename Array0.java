<<<<<<< HEAD
public class Array0 {
    public static void main(String[] args) {
        int arr[] = {3,6,8,7};
        int arr2[] = new int[7];
        int[] arr3 = new int[5];
=======
class Student {
    int rollno;
    String name;
}

public class Array0 {
    public static void main(String[] args) {
        
        int arr[] = {3,6,8,7};
        int arr2[] = new int[7];
        int[] arr3 = new int[5];
        Student[] students = new Student[3];

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
>>>>>>> 501cdbb (19/09/23: Object and Class Day 0)

        for (int n: arr) {
            System.out.println(n);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
<<<<<<< HEAD
=======

        s1.rollno = 40;
        s1.name = "Sourabh";

        s2.name = "Neha";
        s2.rollno = 41;

        s3.name = "Dublin";
        s3.rollno = 42;

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student s : students) {
            System.out.println(s.name+" : "+s.rollno);
        }
>>>>>>> 501cdbb (19/09/23: Object and Class Day 0)
    }
}
