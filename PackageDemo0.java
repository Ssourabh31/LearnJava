import packagesDemo.B;
import packagesDemo.A;

public class PackageDemo0 {
    public static void main(String[] args) {
        //B obj = new A(); // This is not allowed as only parent type reference is allowed

        //This is called runtime polymorphism by doing Dynamic Method Dispatch to decide what to call at runtime
        A obj = new B();

        obj.show();

        obj = new A();
        obj.show();

    }
}
