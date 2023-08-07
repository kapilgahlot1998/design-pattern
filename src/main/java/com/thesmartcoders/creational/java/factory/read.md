**Factory Method Design Pattern**
-
According to GoF, this pattern “defines an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method lets a class defer instantiation to subclasses”.

This pattern delegates the responsibility of initializing a class from the client to a particular factory class by creating a type of virtual constructor.

To achieve this, we rely on a factory which provides us with the objects, hiding the actual implementation details. The created objects are accessed using a common interface.

Example :

Let suppose you have one tax calculator interface which have 1 implementation. So client created object 
using new keyword. But now in future you have created one more implementation of tax Calculator something 
like holidayCalculator which will be applied on case of holiday. But as client has already created object using new
keyword so he will not be able to use new calculator. In this scenarios factory design pattern can be useful.
What type of calculator will be used that can be decided at run time. 

When to Use Factory Method Design Pattern
-

When the implementation of an interface or an abstract class is expected to change frequently
When the current implementation cannot comfortably accommodate new change
When the initialization process is relatively simple, and the constructor only requires a handful of parameters