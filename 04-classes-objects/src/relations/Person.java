package relations;

public class Person {
    /*
       Dependency Relationship

        In the world of UML and OOP, dependency (often called a "uses-a" relationship)
        is the weakest and most ephemeral relationship that can exist between two classes.

        We say that Class A depends on Class B if a change in the structure or behavior
        of Class B forces a modification of Class A. That is, A "knows" B and needs it to
        perform a specific task, but B is not part of A's state (attributes).

        Unlike Association or Composition (where one class stores the other in an
        instance variable or attribute for long-term use), dependency is temporary.

        You use it, it does its job, and you forget about it.

        How does Dependency look in Java code?

        As a Tech Lead, when I do code reviews, I identify a pure dependency relationship when
        I see Class B appearing in Class A in one of these four ways:

        - As a method parameter: Class A receives an object of Class B to operate on.

        - As a local variable: Class A instantiates (creates a new instance of) Class B within a method block.

        - As a return type: A method of Class A returns an object of Class B.

        - Static call: Class A invokes a static method of Class B (for example, when using Math.max() or utilities).

        This is where experience in large companies comes in. Dependencies aren't bad; in fact, they're unavoidable
        (a program without dependencies is a program that does nothing). The problem is the degree of coupling.

        When you use new ValidadorRed() within the method (a local variable dependency), you're creating tight coupling.
        You're "marrying" your PaymentProcessor to the exact implementation of NetworkValidator.

        The problem? When you want to write unit tests for PaymentProcessor, you won't be able to
        mock that network. The code will always try to connect to the real network because the new
        is hardcoded in there.

        That's why, at the architectural level, we always try to transform these local dependencies into
        associations injected through the constructor, using frameworks like Spring Boot

        (what you'll know as Dependency Injection). But at the pure OOP level, any temporary use
        of an object is a dependency relationship.
    */
    public void calculateSum(Calculator calculator) {
        int result = calculator.add(20, 30);

        System.out.println(result);
    }
}
