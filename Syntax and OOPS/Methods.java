public class Methods {
    public static void main(String[] args) {
        printName("azmal");

        System.out.println(mySum(1,2,6));

        mySum1(5,9);
    }

    static void printName(String name){
        System.out.println("Your name is = "+ name);
    }

    static int mySum(int a, int b, int c){
        return a+b+c;
    }
    
    static void mySum1(int a, int b){
        
        System.out.println(a+b);
        return;
    }
}