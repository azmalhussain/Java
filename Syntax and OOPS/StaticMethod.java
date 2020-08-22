public class StaticMethod {

    public static void main(String[] args) {

        final Hello hello = new Hello();

        Hello.age = 10;
        System.out.println(Hello.age);

        // DONT ACCESS STATIC VARIABLE LIKE THIS
        hello.age = 21;
        System.out.println(Hello.age);

        Hello.doSomething("Azmal");
    }

}

class Hello {
    static int age;

    static void doSomething(final String name) {
        System.out.println(name);
    }
}