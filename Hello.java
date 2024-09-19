public class Hello{
    public static void main(String args[]) {
        System.out.println("HelloWorld!");
        
        int a = 30;
        String S = "Sourabh";

        S.toLowerCase();
        System.out.println(S.toLowerCase());

        switch(a) {
            case 10: System.out.println(a);
                break;
            case 20: System.out.println(20);
                break;
            
        }

        switch(a) {
            case 10 -> System.out.println(a);
                
            case 20 -> System.out.println(20);
                
        }
    }
}