public class B extends A {
    public B()
    {
        super(10);
        System.out.println("in default constructor of B");
    }

    public B(int n1)
    {
        this();
        System.out.println("in parameterized constructor of B");
    }
}
