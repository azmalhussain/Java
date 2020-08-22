import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        System.out.println(a);

        String name = scan.next();
        System.out.println(name);

        Double marks = scan.nextDouble();
        System.out.println(marks);

        scan.close();  
    }
}