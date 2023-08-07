Builder Design Pattern
-

The Builder Design Pattern is another creational pattern designed to deal with the construction of comparatively complex objects.

When the complexity of creating object increases, the Builder pattern can separate out the instantiation process by using another object (a builder) to construct the object.

This builder can then be used to create many other similar representations using a simple step-by-step approach.

When to Use Builder Pattern
-
- When the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters
- When an increase in the number of constructor parameters leads to a large list of constructors
- When client expects different representations for the object that's constructed

Applicability
-

- Use the Builder pattern to get rid of a “telescoping constructor”.
  - Say you have a constructor with ten optional parameters. Calling such a beast is very inconvenient; therefore, you overload the constructor and create several shorter versions with fewer parameters. These constructors still refer to the main one, passing some default values into any omitted parameters.
- Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).
- Use the Builder to construct Composite trees or other complex objects.

Pros 
-

- You can construct objects step-by-step, defer construction steps or run steps recursively.
- You can reuse the same construction code when building various representations of products.
- Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.

Cons
-
The overall complexity of the code increases since the pattern requires creating multiple new classes.

