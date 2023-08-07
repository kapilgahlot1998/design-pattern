**Singleton Design Pattern**
-
The Singleton Design Pattern aims to keep a check on initialization of objects of a particular class by ensuring that only one instance of the object exists throughout the Java Virtual Machine.

A Singleton class also provides one unique global access point to the object so that each subsequent call to the access point returns only that particular object.

Here, we've created a static inner class that holds the instance of the Singleton class. It creates the instance only when someone calls the getInstance() method and not when the outer class is loaded.

This is a widely used approach for a Singleton class as it doesn’t require synchronization, is thread safe, enforces lazy initialization and has comparatively less boilerplate.

Also, note that the constructor has the private access modifier. This is a requirement for creating a Singleton since a public constructor would mean anyone could access it and start creating new instances.

*When To Use* 
-
- For resources that are expensive to create (like database connection objects)
- It's good practice to keep all loggers as Singletons which increases performance
- Classes which provide access to configuration settings for the application
- Classes that contain resources that are accessed in shared mode


