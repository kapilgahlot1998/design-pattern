Lombok Builders
-

The @Builder annotation produces complex builder APIs for your classes.

@Builder lets you automatically produce the code required to have your class be instantiable with code such as:

@Builder can be placed on a class, or on a constructor, or on a method. While the "on a class" and "on a constructor" mode are the most common use-case, @Builder is most easily explained with the "method" use-case.

A method annotated with @Builder (from now on called the target) causes the following 7 things to be generated:

- An inner static class named FooBuilder, with the same type arguments as the static method (called the builder).
- In the builder: One private non-static non-final field for each parameter of the target.
- In the builder: A package private no-args empty constructor.
- In the builder: A 'setter'-like method for each parameter of the target: It has the same type as that parameter and the same name. It returns the builder itself, so that the setter calls can be chained, as in the above example.
- In the builder: A build() method which calls the method, passing in each field. It returns the same type that the target returns.
- In the builder: A sensible toString() implementation.
- In the class containing the target: A builder() method, which creates a new instance of the builder.

Immutability
-

We've seen how the @Singular annotation helps us to work with collections in Lombok. Besides providing convenience and expressiveness, it can also help us to keep our code clean.

Immutable objects are defined as objects that cannot be modified once they are created. Immutability is important in reactive architectures, for example, because it allows us to pass an object into a method with a guarantee of no side effects. The Builder pattern is most commonly used as an alternative to POJO getters and setters in order to support immutability.

When our data objects contain Collection classes, it can be easy to let immutability slip a little. The base collection interfaces — List, Set, and Map — all have mutable and immutable implementations. If we rely on the standard Lombok builder, we can accidentally pass in a mutable collection, and then modify it: