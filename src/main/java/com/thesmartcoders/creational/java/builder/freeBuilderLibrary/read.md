FreeBuilder Annotation
-

FreeBuilder is an open-source library that helps developers avoid the boilerplate code while implementing builder classes. It makes use of annotation processing in Java to generate a concrete implementation of the builder pattern.

It's important to point out that Employee is now an interface rather than a POJO class. Furthermore, it contains all the attributes of an Employee object as methods.

Before we continue to use this builder, we must configure our IDEs to avoid any compilation issues. Since FreeBuilder automatically generates the Employee_Builder class during compilation, the IDE usually complains of ClassNotFoundException on line number 8.

To avoid such issues, we need to enable annotation processing in IntelliJ or Eclipse. And while doing so, we'll use FreeBuilder's annotation processor org.inferred.freebuilder.processor.Processor. Additionally, the directory used for generating these source files should be marked as Generated Sources Root.

Alternatively, we can also execute mvn install to build the project and generate the required builder classes.

Finally, we have compiled our project and can now use the Employee.Builder class: