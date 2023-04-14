**SOLID Principles :**

**S : Single Responsibility :**

Every class should serve a single functionality. In an other way There should never be more than one reason for a class to change.
The principal said there should never be more than one reason for a class to change, and we can achieve that, or we can fulfil or satisfy this principal only if our class is actually providing a focused, specific, single functionality.

Example :

Let's take an example.
Let's say that we have code in single class and that code is actually creating and sending a message to a remote server that is listening on some port .Now, what are the possible reasons for this particular class to change?

Well, since we have done a lot more in the single class, there are multiple reasons here.

1. Let's say the communication protocol changes, then our class needs to change.

2. Let's say the message format changes.For example, let's say we were sending our message in a Jason format and suddenly the server said, OK, we are going to accept only XML messages now.So our class again needs to change.

3. Or another reason could be that the parameters of communication, for example, authentication is added as a measure of security.So again, our class needs to change.

So if you see there are multiple reasons because of which our class are of a code that is written in this class is going to change.And this is what we should avoid.OK, this is what our single responsibility principle is saying to avoid. It basically says that if we have three separate responsibilities, then we should have three separate classes or modules to handle those responsibilities and that we whenever something changes, our code can be changed in an organised manner.

OK, we are not going to go inside a huge method just because we want to change our message format from JSON to XML.

OK, so this is what singular responsibility means.

It means that whenever you're designing a class or a module, you should take care, that that particular class is addressing only a specific concern so that when time comes or a change comes down the pipeline,then there is only one reason for a particular class to change.

Code Example :


- [x] Before : https://github.com/harshalgaydhankar/SOLID/tree/main/src/main/java/com/principle/singleResponsibility/before
- [x] After : https://github.com/harshalgaydhankar/SOLID/tree/main/src/main/java/com/principle/singleResponsibility/after

Goal: This principle aims to separate behaviours so that if bugs arise as a result of your change, it won’t affect other unrelated behaviours.


**O : Open-Closed :**

So open, closed principles states that software entities, which basically means classes, are modules or methods.
Software entities should be open for extension, but closed for modification.

OK, this sounds intentionally cryptic, isn't it, but it is actually not.This is a very, very easy principle to understand if you know Java and if you know object oriented programming.
OK, so when we say open for extension, it basically means that we should be able to extend existing behaviour.
And we it says closed for modification.It means that whatever is already written should not be changed.

What it means in Java is that we have a base class that is already written and tested. And if we want to extend or modify behaviour of one of the methods that is written in this class, then we should be able to do that.And we can do that using inheritance.
We can extend from this base class and we can override a method.
OK, so this is what open for extension means and close for modification basically means that we should not go and modify code that is written in a base class because that code is ideally written and already tested.
So this is what open clause principle is telling us to do.It is telling us to avoid or to completely avoid modifying existing base classes and using inheritance and overriding in order to achieve extension of existing behaviour.

Example of Shape or Vehicle
Code Example :

- [x] Before : https://github.com/harshalgaydhankar/SOLID/tree/main/src/main/java/com/principle/openClosed/before
- [x] After : https://github.com/harshalgaydhankar/SOLID/tree/main/src/main/java/com/principle/openClosed/after

Goal: This principle aims to extend a Class’s behaviour without changing the existing behaviour of that Class. This is to avoid causing bugs wherever the Class is being used.


**L : Liskov Substitution** :

If S is a subtype of T, then objects of type T in a program may be replaced with objects of type S without altering any of the desirable properties of that program.

When a child Class cannot perform the same actions as its parent Class, this can cause bugs.
If you have a Class and create another Class from it, it becomes a parent and the new Class becomes a child. The child Class should be able to do everything the parent Class can do. This process is called Inheritance.
The child Class should be able to process the same requests and deliver the same result as the parent Class or it could deliver a result that is of the same type.

Code Example :

- [x] Before : https://github.com/harshalgaydhankar/SOLID/tree/main/src/main/java/com/principle/liskovSubstitution/before
- [x] After : https://github.com/harshalgaydhankar/SOLID/tree/main/src/main/java/com/principle/liskovSubstitution/after

Goal: This principle aims to enforce consistency so that the parent Class or its child Class can be used in the same way without any errors.


**I : Interface Segregation :**

Clients should not be forced to depend on methods that they do not use.

When a Class is required to perform actions that are not useful, it is wasteful and may produce unexpected bugs if the Class does not have the ability to perform those actions.
A Class should perform only actions that are needed to fulfil its role. Any other action should be removed completely or moved somewhere else if it might be used by another Class in the future.

Code Example :

- [x] Before : https://github.com/harshalgaydhankar/SOLID/tree/main/src/main/java/com/principle/interfaceSeggregation/before
- [x] After : https://github.com/harshalgaydhankar/SOLID/tree/main/src/main/java/com/principle/interfaceSeggregation/after

Goal : This principle aims at splitting a set of actions into smaller sets so that a Class executes ONLY the set of actions it requires.


**D : Dependency Inversion :**

- High-level modules should not depend on low-level modules. Both should depend on the abstraction.
- Abstractions should not depend on details. Details should depend on abstractions.

Firstly, let’s define the terms used here more simply
High-level Module(or Class): Class that executes an action with a tool.
Low-level Module (or Class): The tool that is needed to execute the action
Abstraction: Represents an interface that connects the two Classes.
Details: How the tool works
This principle says a Class should not be fused with the tool it uses to execute an action. Rather, it should be fused to the interface that will allow the tool to connect to the Class.
It also says that both the Class and the interface should not know how the tool works. However, the tool needs to meet the specification of the interface.

Code Example :

- [x] Before : https://github.com/harshalgaydhankar/SOLID/tree/main/src/main/java/com/principle/dependencyInversion/before
- [x] After : https://github.com/harshalgaydhankar/SOLID/tree/main/src/main/java/com/principle/dependencyInversion/after

Goal : This principle aims at reducing the dependency of a high-level Class on the low-level Class by introducing an interface.




































































