public class MethodOverriding {
    public static void main(String[] args) {
        Calc obj = new AdvCalc();
        System.out.println(obj.add(9,2)); //This will first search in child class and after that goes to Parent if not found in Chuld  
    }
}
