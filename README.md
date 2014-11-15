
#Design pattern samples in Java.

## Build status:

![Build status](https://travis-ci.org/iluwatar/java-design-patterns.svg?branch=master)


##Abstract Factory
**Intent:** Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/abstract-factory/etc/abstract-factory.jpg "Abstract Factory")

**Applicability:** Use the Abstract Factory pattern when
* a system should be independent of how its products are created, composed and represented
* a system should be configured with one of multiple families of products
* a family of related product objects is designed to be used together, and you need to enforce this constraint
* you want to provide a class library of products, and you want to reveal just their interfaces, not their implementations

##抽象工厂
**意图：**
	 提供一个创建具有相关或者是独立对象群体的接口，这些相关或者独立的对象没有指定具体的类

**适用：**
	*一个系统的产品的创建/组合/表达应该是独立的时候
	*一个系统应该由多个产品家族中的一个来配置的时候
	*相关产品对象的群体被设计在一起，你需要增强他们之间的联系
	*你想要提供一个产品类库，而且你只想要暴露他们的接口，不要暴露他们之间的实现

##Builder
**Intent:** Separate the construction of a complex object from its representation so that the same construction process can create different representations.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/builder/etc/builder.jpg "Builder")

**Applicability:** Use the Builder pattern when
* the algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled
* the construction process must allow different representations for the object that's constructed

##Factory Method
**Intent:** Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/factory-method/etc/factory-method.jpg "Factory Method")

**Applicability:** Use the Factory Method pattern when
* a class can't anticipate the class of objects it must create
* a class wants its subclasses to specify the objects it creates
* classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate

##Prototype
**Intent:** Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/prototype/etc/prototype.jpg "Prototype")

**Applicability:** Use the Prototype pattern when a system should be independent of how its products are created, composed and represented; and
* when the classes to instantiate are specified at run-time, for example, by dynamic loading; or
* to avoid building a class hierarchy of factories that parallels the class hierarchy of products; or
* when instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state

##Singleton
**Intent:** Ensure a class only has one instance, and provide a global point of access to it.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/singleton/etc/singleton.jpg "Singleton")

**Applicability:** Use the Singleton pattern when
* the must be exactly one instance of a class, and it must be accessible to clients from a well-known access point
* when the sole instance should be extensible by subclassing, and clients should be able to use an extended instance without modifying their code

##Adapter
**Intent:** Convert the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/adapter/etc/adapter.jpg "Adapter")

**Applicability:** Use the Adapter pattern when
* you want to use an existing class, and its interface does not match the one you need
* you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces
* you need to use several existing subclasses, but it's impractical to adapt their interface by subclassing every one. An object adapter can adapt the interface of its parent class.

##Bridge
**Intent:** Decouple an abstraction from its implementation so that the two can vary independently.


![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/bridge/etc/bridge.jpg "Bridge")

**Applicability:** Use the Bridge pattern when
* you want to avoid a permanent binding between an abstraction and its implementation. This might be the case, for example, when the implementation must be selected or switched at run-time.
* both the abstractions and their implementations should be extensible by subclassing. In this case, the Bridge pattern lets you combine the different abstractions and implementations and extend them independently
* changes in the implementation of an abstraction should have no impact on clients; that is, their code should not have to be recompiled.
* you have a proliferation of classes. Such a class hierarchy indicates the need for splitting an object into two parts. Rumbaugh uses the term "nested generalizations" to refer to such class hierarchies
* you want to share an implementation among multiple objects (perhaps using reference counting), and this fact should be hidden from the client. A simple example is Coplien's String class, in which multiple objects can share the same string representation.

##Composite
**Intent:** Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/composite/etc/composite.jpg "Composite")

**Applicability:** Use the Composite pattern when
* you want to represent part-whole hierarchies of objects
* you want clients to be able to ignore the difference between compositions of objects and individual objects. Clients will treat all objects in the composite structure uniformly

##Decorator
**Intent:** Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/decorator/etc/decorator.jpg "Decorator")

**Applicability:** Use Decorator
* to add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects
* for responsibilities that can be withdrawn
* when extension by subclassing is impractical. Sometimes a large number of independent extensions are possible and would produce an explosion of sublasses to support every combination. Or a class definition may be hidden or otherwise unavailable for subclassing

##Facade
**Intent:** Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/facade/etc/facade.jpg "Facade")

**Applicability:** Use the Facade pattern when
* you want to provide a simple interface to a complex subsystem. Subsystems often get more complex  as they evolve. Most patterns, when applied, result in more and smaller classes. This makes the subsystem more reusable and easier to customize, but is also becomes harder to use for clients that don't need to customize it. A facade can provide a simple default view of the subsystem that is good enough for most clients. Only clients needing more customizability will need to look beyond the facade.
* there are many dependencies between clients and the implementation classes of an abstraction. Introduce a facade to decouple the subsystem from clients and other subsystems, thereby promoting subsystem independence and portability.
* you want to layer your subsystems. Use a facade to define an entry point to each subsystem level. If subsystems are dependent, the you can simplify the dependencies between them by making them communicate with each other solely through their facades

##Flyweight
**Intent:** Use sharing to support large numbers of fine-grained objects efficiently.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/flyweight/etc/flyweight.jpg "Flyweight")

**Applicability:** The Flyweight pattern's effectiveness depends heavily on how and where it's used. Apply the Flyweight pattern when all of the following are true
* an application uses a large number of objects
* storage costs are high because of the sheer quantity of objects
* most object state can be made extrinsic
* many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed
* the application doesn't depend on object identity. Since flyweight objects may be shared, identity tests will return true for conceptually distinct objects.

##Proxy
**Intent:** Provide a surrogate or placeholder for another object to control access to it.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/proxy/etc/proxy.jpg "Proxy")

**Applicability:** Proxy is applicable whenever there is a need for a more versatile or sophisticated reference to an object than a simple pointer. here are several common situations in which the Proxy pattern is applicable
* a remote proxy provides a local representative for an object in a different address space.
* a virtual proxy creates expensive objects on demand.
* a protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights.

##Chain of responsibility
**Intent:** Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/chain/etc/chain.jpg "Chain of Responsibility")

**Applicability:** Use Chain of Responsibility when
* more than one object may handle a request, and the handler isn't known a priori. The handler should be ascertained automatically
* you want to issue a request to one of several objects without specifying the receiver explicitly
* the set of objects that can handle a request should be specified dynamically

##Command
**Intent:** Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/command/etc/command.jpg "Command")

**Applicability:** Use the Command pattern when you want to
* parameterize objects by an action to perform. You can express such parameterization in a procedural language with a callback function, that is, a function that's registered somewhere to be called at a later point. Commands are an object-oriented replacement for callbacks.
* specify, queue, and execute requests at different times. A Command object can have a lifetime independent of the original request. If the receiver of a request can be represented in an address space-independent way, then you can transfer a command object for the request to a different process and fulfill the request there
* support undo. The Command's execute operation can store state for reversing its effects in the command itself. The Command interface must have an added Unexecute operation that reverses the effects of a previous call to execute. Executed commands are stored in a history list. Unlimited-level undo and redo is achieved by traversing this list backwards and forwards calling unexecute and execute, respectively
* support logging changes so that they can be reapplied in case of a system crash. By augmenting the Command interface with load and store operations, you can keep a persistent log of changes. Recovering from a crash involves reloading logged commands from disk and re-executing them with the execute operation
* structure a system around high-level operations build on primitive operations. Such a structure is common in information systems that support transactions. A transaction encapsulates a set of changes to data. The Command pattern offers a way to model transactions. Commands have a common interface, letting you invoke all transactions the same way. The pattern also makes it easy to extend the system with new transactions

##Interpreter
**Intent:** Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/interpreter/etc/interpreter.jpg "Interpreter")

**Applicability:** Use the Interpreter pattern when there is a language to interpret, and you can represent statements in the language as abstract syntax trees. The Interpreter pattern works best when
* the grammar is simple. For complex grammars, the class hierarchy for the grammar becomes large and unmanageable. Tools such as parser generators are a better alternative in such cases. They can interpret expressions without building abstract syntax trees, which can save space and possibly time
* efficiency is not a critical concern. The most efficient interpreters are usually not implemented by interpreting parse trees directly but by first translating them into another form. For example, regular expressions are often transformed into state machines. But even then, the translator can be implemented by the Interpreter pattern, so the pattern is still applicable

##Iterator
**Intent:** Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/iterator/etc/iterator.jpg "Iterator")

**Applicability:** Use the Iterator pattern
* to access an aggregate object's contents without exposing its internal representation
* to support multiple traversals of aggregate objects
* to provide a uniform interface for traversing different aggregate structures

##Mediator
**Intent:** Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/mediator/etc/mediator.jpg "Mediator")

**Applicability:** Use the Mediator pattern when
* a set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured and difficult to understand
* reusing an object is difficult because it refers to and communicates with many other objects
* a behavior that's distributed between several classes should be customizable without a lot of subclassing

##Memento
**Intent:** Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/memento/etc/memento.jpg "Memento")

**Applicability:** Use the Memento pattern when
* a snapshot of an object's state must be saved so that it can be restored to that state later, and
* a direct interface to obtaining the state would expose implementation details and break the object's encapsulation

##Model-View-Presenter
**Intent:** Apply a "Separation of Concerns" principle in a way that allows developers to build and test user interfaces.

![alt text](https://github.com/pitsios-s/java-design-patterns/blob/master/model-view-presenter/etc/model-view-presenter.jpg "Model-View-Presenter")

**Applicability:** Use the Model-View-Presenter in any of the following situations
* when you want to improve the "Separation of Concerns" principle in presentation logic
* when a user interface development and testing is necessary.

##Observer
**Intent:** Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/observer/etc/observer.jpg "Observer")

**Applicability:** Use the Observer pattern in any of the following situations
* when an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary and reuse them independently
* when a change to one object requires changing others, and you don't know how many objects need to be changed
* when an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don't want these objects tightly coupled

##State
**Intent:** Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/state/etc/state.jpg "State")

**Applicability:** Use the State pattern in either of the following cases
* an object's behavior depends on its state, and it must change its behavior at run-time depending on that state
* operations have large, multipart conditional statements that depend on the object's state. This state is usually represented by one or more enumerated constants. Often, several operations will contain this same conditional structure. The State pattern puts each branch of the conditional in a separate class. This lets you treat the object's state as an object in its own right that can vary independently from other objects.

##Strategy
**Intent:** Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/strategy/etc/strategy.jpg "Strategy")

**Applicability:** Use the Strategy pattern when
* many related classes differ only in their behavior. Stratefies provide a way to configure a class eith one of many behaviors
* you need different variants of an algorithm. for example, you migh define algorithms reflecting different space/time trade-offs. Strategies can be used when these variants are implemented as a class hierarchy of algorithms
* an algorithm uses data that clients shouldn't know about. Use the Strategy pattern to avoid exposing complex, algorithm-specific data structures
* a class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals, move related conditional branches into their own Strategy class

##Template method
**Intent:** Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/template-method/etc/template-method.jpg "Template Method")

**Applicability:** The Template Method pattern should be used
* to implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that can vary
* when common behavior among subclasses should be factored and localized in a common class to avoid code duplication. This is good example of "refactoring to generalize" as described by Opdyke and Johnson. You first identify the differences in the existing code and then separate the differences into new operations. Finally, you replace the differing code with a template method that calls one of these new operations
* to control subclasses extensions. You can define a template method that calls "hook" operations at specific points, thereby permitting extensions only at those points

##Visitor
**Intent:** Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

![alt text](https://github.com/iluwatar/java-design-patterns/blob/master/visitor/etc/visitor.jpg "Visitor")

**Applicability:** Use the Visitor pattern when
* an object structure contains many classes of objects with differing interfaces, and you want to perform operations on these objects that depend on their concrete classes
* many distinct and unrelated operations need to be performed on objects in an object structure, and you want to avoid "polluting" their classes with these operations. Visitor lets you keep related operations together by defining them in one class. When the object structure is shared by many applications, use Visitor to put operations in just those applications that need them
* the classes defining the object structure rarely change, but you often want to define new operations over the structure. Changing the object structure classes requires redefining the interface to all visitors, which is potentially costly. If the object structure classes change often, then it's probably better to define the operations in those classes

##Double Checked Locking
**Intent:** Reduce the overhead of acquiring a lock by first testing the locking criterion (the "lock hint") without actually acquiring the lock. Only if the locking criterion check indicates that locking is required does the actual locking logic proceed.

![alt text](https://github.com/yusufaytas/java-design-patterns/blob/master/double-checked-locking/etc/double_checked_locking.jpeg "Double Checked Locking")

**Applicability:** Use the Double Checked Locking pattern when
* there is a concurrent access in object creation, e.g. singleton, where you want to create single instance of the same class and checking if it's null or not maybe not be enough when there are two or more threads that checks if instance is null or not.
* there is a concurrent access on a method where method's behaviour changes according to the some constraints and these constraint change within this method.

# Frequently asked questions

**Q: What is the difference between State and Strategy patterns?**

While the implementation is similar they solve different problems. The State pattern deals with what state an object is in - it encapsulates state-dependent behavior. The Strategy pattern deals with how an object performs a certain task - it encapsulates an algorithm.

**Q: What is the difference between Strategy and Template Method patterns?**

In Template Method the algorithm is chosen at compile time via inheritance. With Strategy pattern the algorithm is chosen at runtime via composition.

**Q: What is the difference between Proxy and Decorator patterns?**

The difference is the intent of the patterns. While Proxy controls access to the object Decorator is used to add responsibilities to the object.



# How to contribute

For a new pattern to be added you need to do the following steps:

1. Fork the repository.
2. Implement the code changes in your fork. Remember to add sufficient comments documenting the implementation.
3. Create a simple class diagram from your example code. I've used [GenMyModel](https://www.genmymodel.com/) and its "Export as JPEG" feature.
4. Add description of the pattern in README.md and link to the class diagram.
5. Create a pull request.

If you want to edit the existing UML diagrams I can easily add you as an editor to the corresponding GenMyModel-project. Just drop me an email mentioning the pattern you are editing.

There is a good list of design patterns at [Wikipedia](http://en.wikipedia.org/wiki/Software_design_pattern).



# Credits

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
* [Effective Java (2nd Edition)](http://www.amazon.com/Effective-Java-Edition-Joshua-Bloch/dp/0321356683)



# License

This project is licensed under the terms of the MIT license.
