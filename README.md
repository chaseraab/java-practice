# Resources

[Java Cheat Sheet](Files/Java-Cheat-Sheet.pdf)


# Java Basics

- The stack is memory allocation for local variables and method calls
- The heap is memory allocation for objects and instance variables
- Instantiaion - Allocating memory to create an object
- Initialization - Assignment of values when object is instantiated
- 'This' is only required when there is a namespace collision	
- 'Static' indicates class membership which differs from instance membership

	
- A constant is a variable whose value cannot be changed once its assigned
  - Uses 'final' 
    - Final is a non-access modifier

# Access Control
- public - accessible everywhere
- protected - accessible in the same package and in sub-class
- default - accessible only in the same package	
- private - accessible only in the same class

# Object Oriented Programming
## Inheritance
- inheriting the common state and behavior
- The subclass (child) extends the super class (parent)
- A subclass cannot extend multiple super classes
- Variables are determined from the reference type	
- Methods are determined from the actual type

## Polymorphism
- Method overloading is an example of compile-time polymorphism	
- A class cannot have multiple methods with the same signature and different primitive return types	
  - A signature is the method name and its parameters
- Method overriding is an example of run-time polymorphism 
  - Return types must remain consistent
- run-time polymorphism doesn't happen for static methods 
  - i.e. a static method will refer to the reference type and not the actual type
- Final Keyword
  - prevent the inheritance process 
  - preserve the consistent state of the object
  - Final Class: immutable class and prevent inheritance  
  - Final Method: prevent overriding 
  - Final Variable: Constant variable
  - Private methods are final and cannot be overridden 

## Abstraction
- Abstract classes are incomplete 
- Abstract methods have declarations but no implementations  
- If a class has a single abstract method, the class must be abstract 
- Objects cannot be created from abstract classes 
- You cannot reduce the visibility of an inherited method

### Interfaces
- Contains method signatures to define specifications 
- Subtypes must follow the specifications 
- Declares What to implement but not how to implement 
- An interface can extend multiple interfaces 
- Interfaces can have implementations for default methods 
  - This was added so that adding methods to an interface wouldn't break all implementing classes

## Encapsulation	
- Wrapping code and data together into a single unit	
- Private members and access only through public getters and setters	
- Whatever changes, encapsulate it	
- Encapsulation is about "How" a class does things

# SOLID Principles
## Single Responsibility Principle
[Geeks for Geeks](https://www.geeksforgeeks.org/system-design/single-responsibility-in-solid-design-principle/)
- A class should do one thing therefore it should have only a single reason to change
- Makes code easier to test
- Less dependencies to other modules / classes
- Better code organization and less complexity
- Example: Using multiple classes, each one providing a small but of logic, versus one large class which does everything

## Open-Closed Principle
[Geeks for Geeks](https://www.geeksforgeeks.org/java/open-closed-principle-in-java-with-examples/)
- Software components should be open for extension but closed for modification
- Typically done through the use of interfaces and abstract classes
- Example: Adding functionality to a geometric object area calculator

## Liskov Substitution Principle
[Geeks for Geeks](https://www.geeksforgeeks.org/system-design/solid-principle-in-programming-understand-with-real-life-examples/#)
- Derived types must be completely substitutable for their base types
- Implementations of the same interface should never give a different result
- Example: Square and rectangle

## Interface Segregation Principle
[ndepend](https://blog.ndepend.com/solid-design-the-interface-segregation-principle-isp/)
[Geeks for Geeks](https://www.geeksforgeeks.org/system-design/solid-principle-in-programming-understand-with-real-life-examples/)
- Clients should not be forced to implement unnecessary methods which they will not use
- Example: Only needing to read from a list - write operations not needed

### Dependency Inversion Principle
[Geeks for Geeks](https://www.geeksforgeeks.org/system-design/dependecy-inversion-principle-solid/)
[stackify](https://stackify.com/dependency-inversion-principle/)
- High level modules, which provide complex logic, should be easily reusable and unaffected by changes in low-level modules, which provide utility features. This requires an abstraction that decouples
the high level and low level modules from each other.
Or
- High level modules should not depend on low level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.