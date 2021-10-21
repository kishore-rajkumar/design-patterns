# Abstract Pattern
### Definition
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.


# Solution Diagram

![image](https://drive.google.com/uc?export=view&id=14hK1QRE2DV3cXIF4QIxy-5Mzb7xnnzur)

• Encapsulated object creation.<br/>
– Creating objects is implemented (encapsulated) in a separate class (Factory1).<br/>
– This makes it easy to change the way objects are created (which concrete classes get instantiated) independently from (without having to change) clients.<br/>

• Centralized object creation.<br/>
– Creating objects is centralized in a single Factory1 class.<br/>

### Design Problems

![image](https://drive.google.com/uc?export=view&id=1WyvkDr5aA_6lvBbGI6iwDab3MUprI3EA)

• Hard-wired object creation.<br/>
– Creating objects is implemented (hard-wired) directly within a class (Client).<br/>
– This makes it hard to change the way objects are created (which concrete classes get instantiated) independently from (without having to change) the class.<br/>

• Distributed object creation.<br/>
– Creating objects is distributed across the classes of an application.

