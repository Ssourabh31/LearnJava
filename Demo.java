import java.net.SocketPermission;
import java.time.format.SignStyle;
import java.util.concurrent.Flow.Subscriber;

class Calculator
{
    int val;

    public int Add(int a, int b){
        System.out.println("Adding two numbers "+a+" "+b);
        return a + b;
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        
        System.out.println(c1.Add(4, 5));
    }
}
