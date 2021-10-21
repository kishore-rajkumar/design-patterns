# Visitors Pattern
### Definition
Represent an operation to be performed on the elements of an object structure.
- Visitor lets you define a new operation without changing the classes of the elements on which it operates.
- <b>SOLVES:</b>  How can new operations be defined for the classes of an object structure
without changing the classes?



# Solution Diagram

![image](https://drive.google.com/uc?export=view&id=1N0s4GeoHZdcR9TUFxQdBFDfn7ArsRoJZ)

• New operations are encapsulated in a separate Visitor class.<br/>
– A new operation for each Element class is defined in a separate class (Visitor1).<br/>
– "You create a new operation by adding a new subclass to the visitor class hierarchy."<br/>

### Design Problems

![image](https://drive.google.com/uc?export=view&id=1NiVly8R3FviNHhKPEpPLkxoTDvBiqSl7)

• New operations are distributed across the Element classes.<br/>
	- A new operation for each Element class is defined by adding subclasses.<br/>
	- "The problem here is that distributing all these operations across the various node [element] classes leads to a system that's hard to understand, maintain, and change." <br/>


