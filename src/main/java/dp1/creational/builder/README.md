# Builder Pattern
### Definition
Separate the construction of a complex object from its representation so that the same construction process can create different representations.


# Solution Diagram

![image](https://drive.google.com/uc?export=view&id=1ncvDrN70H0FRATkBK0uaxzjalGUX3vRH)

• Encapsulated object creation.<br/>
– Creating a representation of a complex object is implemented (encapsulated) in a separate class (Builder1).<br/>
– This makes it easy to create a different representation independently from (without having to change) clients (Director).<br/>

• Simplified classes.<br/>
– Classes that delegate creating a complex object are easier to implement, change, test, and reuse.

### Design Problems

![image](https://drive.google.com/uc?export=view&id=1NVZVvyFm44a8bceSYiioL2sVLHni9_uu)

• Hard-wired object creation.<br/>
– Creating a representation of a complex object is implemented (hard-wired) directly within a class (Client).<br/>
– This makes it hard to create a different representation independently from (without having to change) the class.<br/>

• Complicated classes.<br/>
– Classes that include creating a complex object are hard to implement, change, test, and reuse.


