/**
 * MethodOverLoading
 */
public class MethodOverLoading {

    public static void main(String[] args) {
        
        System.out.println(Add(3,5));
        System.out.println(Add(3,5,4));
        System.out.println(Add(5.1,6.3));
        System.out.println(Add("The ", "Dude"));
        
    }

    public static int Add(int a, int b) {
        return a+b;
    }

    public static int Add(int a, int b, int c) {
        return a+b+c;
    }

    public static double Add(double a, double b) {
            return a+b;
    }

    public static String Add(String a, String b) {
            return a+b;        
    }
}