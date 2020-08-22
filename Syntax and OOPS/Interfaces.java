public class Interfaces {
    public static void main(String[] args) {
        boy b1 = new boy();
        System.out.println(b1.getHobby());

        System.out.println(Human.age);
        
    }
}

// Interafaces cant be instantiated
// interface === abstract class + all abstract methods
// no need to add abstarct keyword for methods
// IMPLEMENTS keyword is used for inheritance

interface Human{

    // interface variables are static and final by default(no option) and must be initialised during declaration
    int age=21;

    //All methods in an interface default to PUBLIC
    String getHobby();
}

class boy implements Human{
    
    public String getHobby(){
        return "Nothing";
    }
}