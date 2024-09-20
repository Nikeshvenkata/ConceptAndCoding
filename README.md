Concept && Coding

OOPs Fundamentals: Class, Object, Constructor, 4 Pillars [Abstraction, Encapsulation, Polymorphism, Inheritance].
Basics of Java: JDK, JVM, JRE, What is Java, First Program In Java, etc…
One Level Deeper: Abstract, Inner class, [static, Final, Primitive variables], Pass By Value, Pass By Reference, Garbage Collector.
Different Operators, Control Flow Statements: All Types of Operators, [if else, switch, for, while, do while, break, continue].
MultiThreading & Concurrency: UnderStand multiple ways to achieve multithreading.
Exception Handling: Handling of Compile Time and Run Time Errors.
Generic Programming: Understanding how to write Generic Classes and Methods in Java.
Java Collections: List, Queue, Set, Map.
Java 8 Features: Functional Interface, Lambda Expression, Stream API’s, Predicate, Default and Static methods in Interface.

Unit Testing: Understanding how to do unit testing of java code.[Mockito Framework]



★ OOPs Fundamentals: Object Oriented Programming System.
	Class is a blueprint, Here Object is a real world Entity.
	- Program is divided into Objects.
	- Objects provide data hiding, gives important to data.
	- Overloading, Inheritance is possible.
	- Code Reusability is present.

Objects has 2 Things: Properties[State] and Behaviour[Function].

To Create an Object a class is required.
So class provides a blueprint from which objects can be created.
From one class we can create multiple objects.

Abstraction: It hides the internal implementation ans show only the essential functionality to the user.
       		It can be achieved through Interface and Abstract class.
Encapsulation: Make variables as private, Use Getters and Setters to modify/view the value of the variables.
Inheritance: Capability of a class to inherit the properties from their Parent class. can be achieved using extends.
        	It can inherit both functions and variables, so we don’t have to write them again in child class.
Polymorphism: It can be achieved using [Compile Time / Method Overloading] and [Run Time / Method Overriding].

Objects Relationships:
Is-A-Relationship: Achieve through Inheritance. [Dog IS-A Animal, Car IS-A Animal...]
Has-A-Relationship: Whenever an object is used in another class. [School HAS Students, Bike HAS Engine...]



★ Java Basics Overview:

Compilation Flow:
		Java Program ----------> Java Byte Code ----------> JVM -----------------> Output
		[.java file]  compiler    [.class file]                   [Machine Code]

What is Java: Platform Independent Language, OOPs, Portability [Write Once Run Anywhere]
Java is a Statically typed, Strongly typed programming language.

JVM - Java Virtual Machine [Abstract Machine - Virtual Machine], JVM is Platform Dependent.
		It has JIT compiler [Just In Time]
JRE - Java RunTime Environment, [JVM + InBuilt Libraries] Ex: java.util, java.math etc….
JDK - Java Development Kit, [JRE + Programming Language(.java), Compiler(.class), Debugger]

Class: It is a BluePrint used to define Objects
       It can contain Variables, Methods, Interfaces, Member Class, Constructors.


HelloWorld.java : 
public class HelloWorld {
  public static void main (String[] args){
	  System.out.print(“Basic Hello World Program”);
	}
}

Access Modifiers: Public, Private, Protected, Default
class: In java everything is written in class, objects. [HelloWorld is class name].
static: We don’t need to create an object of that particular method.
void: It is the return type, Void means it doesn’t expect any return statements from the method.
main: Main is the name of the method, Java considers main as the entry point of the program.
String[] args: Command Line Argument.
System.out.print(): We are calling inbuilt methods and asking to print on console.

Why a single Java file can have only 1 public class ??
- main method should be inside public class.
- public class name should be same as file name.



★ Java Variables In Depth:
	
Variable: It is a container which stores a value, It can start with $, _, letters.
dataType variableName = value;
	
1 byte ‎ = 0.001 KB 8 bits
Types of Variables:
Primitive Data Types: byte, char, short, int, long, float, double, boolean.
			          Size:  1     2      2     4     8     4      8        1     - bytes

The default values for the variables will be assigned to the class member variables only.
For local variables we need to manually specify the values.

Kind of Variables: Local Variables , Instance / Member Variables, Static Variables, Method Parameters, Constructor Parameters.
 
