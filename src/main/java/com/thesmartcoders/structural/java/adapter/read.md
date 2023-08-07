Adapter Pattern
-
An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. The main goal for this pattern is to convert an existing interface into another one the client expects.

The structure of this pattern is similar to the Decorator. However, the Decorator is usually implemented with the extension in mind. The Adapter is usually implemented after the initial code is written to connect incompatible interfaces. There are two main ways to implement this pattern, so let's review them.

Applicability
-

1. Use the Adapter class when you want to use some existing class, but its interface isn’t compatible with the rest of your code.
2. Use the pattern when you want to reuse several existing subclasses that lack some common functionality that can’t be added to the superclass.

Pros
-
1. Single Responsibility Principle. You can separate the interface or data conversion code from the primary business logic of the program.
2. Open/Closed Principle. You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface.

cons
-
1. The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code.



