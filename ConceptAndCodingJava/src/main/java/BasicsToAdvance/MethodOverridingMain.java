package BasicsToAdvance;

class Animal{
    public void walk(){
        System.out.println("Animal Walking");
    }
    public void eat(){
        System.out.println("Animal Eating");
    }
    public void sleep(){
        System.out.println("Animal Sleeping");
    }
}

class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("Dog Eating");
    }
    @Override
    public void sleep(){
        System.out.println("Dog Sleeping");
    }
    public void bark(){
        System.out.println("Dog Barking");
    }
    public void dance(){
        System.out.println("Dog Dancing");
    }
}

public class MethodOverridingMain {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.walk(); a.eat(); a.sleep();
        System.out.println();

        Animal b = new Dog();
        b.walk(); b.eat(); b.sleep();
        // b.bark(); b.dance();- Compile Time Error
        // All the Parent class methods will be executed
        // If child class has the overridden methods, Those overridden methods will be executed.
        System.out.println();

        // Dog c = new Animal(); - Compile Time Error
        // In case of Inheritance Parent knows Child, But Child doesn't know Parent.

        Dog d = new Dog();
        d.bark(); d.eat(); d.sleep(); d.dance(); d.walk();
    }
}