# Factory Method Pattern

###Definition

Define and interface for creating objects, but let the subclass decide which class to instantiate.
- Factory method lets a class differ instantiation to it subclasses.

# Solution Diagram

![image](https://drive.google.com/uc?export=view&id=1OXFRTXKt01i63voTX-fMBKigVnjoWngI)

• Encapsulated object creation.<br/>
– Object creation is defined (encapsulated) in a separate operation (factory method).<br/>
– This makes it easy to change the instantiation independently from the class (by adding new subclasses).

• Deferred object creation.<br/>
– Creator defers instantiation to subclasses by calling an abstract factory method.<br/>
– "It gets around the dilemma of having to instantiate unforeseeable classes."


### Design Problems

![image](https://drive.google.com/uc?export=view&id=1pSoQJInkrP5MsLf8yOWMS2ZfvT83mxEy)

• Hard-wired object creation.<br/>
– Object creation is defined (hard-wired) directly within a class (Creator).<br/>
– This makes it hard to change the instantiation independently from (without having to change) the class.<br/>

• Unknown object creation.<br/>
– A reusable class often doesn't know which class to instantiate.<br/>
– Users of the class should specify which class to instantiate to suit their needs (by writing subclasses).


