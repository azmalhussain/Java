public class PolyMorphism {
    public static void main(String[] args) {

        //method-overRiding
        //parent class reference TO child class object
        Bank b1 = new icici();
        System.out.println(b1.getInterestRate());

        Bank b2 = new hdfc();
        System.out.println(b2.getInterestRate());

    }
}

// abstract class cannot be instantiated (no object creation)
// but can be extended
abstract class Bank{

    // abstract method must be implemented in child class
    abstract int getInterestRate();
}

// a class with a abstract method must be declared as abstract
// a abstract method isn't a must for abstract class

class icici extends Bank{
    int getInterestRate(){
        return 6;
    }
}

class hdfc extends Bank{
    int getInterestRate(){
        return 7;
    }
}