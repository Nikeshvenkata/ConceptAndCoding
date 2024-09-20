package BasicsToAdvance;

public class MethodOverloadingMain {

    // Constructor Overloading
    public String name;
    public int age;

    public MethodOverloadingMain() { }
    public MethodOverloadingMain(String name) { this.name = name; }
    public MethodOverloadingMain(int age) { this.age = age; }
    public MethodOverloadingMain(String name, int age) { this.name = name; this.age = age; }

    // Method Overloading - CompileTime Polymorphism / Static Binding / Early Binding
    public void m1(){ System.out.println("m1"); }
    public int m1(int a){ return a; }
    public double m1(double a, double b){ return a + b; }
    public int m1(int a, int b){ return a + b; }

    // toString Method
    @Override
    public String toString() {
        return "OverloadingMain{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public static void main(String[] args) {
        MethodOverloadingMain o = new MethodOverloadingMain("Nikesh", 25);
        System.out.println(o);
        o.m1(); System.out.println(o.m1(7) + ", " + o.m1(13,7) + ", " + o.m1(13.3,7.8) );

        // Operator Overloading [Same + operator acting as different in different scenarios]
        System.out.println(13 + 7); // 30
        System.out.println("13" + 7); // 137
        System.out.println("Hello" + " World! " + 13 + 7); // Hello World! 137
        System.out.println(13 + 7 + " Hello " + 11 + " World! " + 1 + 5); // 20 Hello 11 World! 15
        System.out.println(13 + 7 + " Hello " + 11 + " World! " + ( 1 + 5 ) ); // 20 Hello 11 World! 6
    }
}

//Car Maruthi = new Car();
//Object Declaration -> Car Maruthi
//Memory Allocation -> new Car();
//
//Compile Time Polymorphism / Static Binding / Early Binding - Overloading
//Run Time Polymorphism / Dynamic Binding / Late Binding - Overriding
//
//final variables, Once we initialise them we can not change them.
//final methods - These methods cannot be overridden in case of inheritance.
//final class - we cannot extend this class with other class (Inheritance),
//Variables inside final class are not final,
//But since inheritance is not possible, so we can't extend this class
//Hence methods in final class can be considered as final methods only.