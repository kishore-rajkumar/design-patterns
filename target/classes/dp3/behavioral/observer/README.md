# Observer Pattern
### Definition
Define a one-to-many dependency among objects so that when one object changes state all its dependent objects are notified and updated accordingly.

# Solution Diagram

![image](https://drive.google.com/uc?export=view&id=1IemPgB0Wff14pOtwv-RAMoKU4o1Dsfqn)

• Loose coupling between subject and observers.<br/>
– Subject delegates (the responsibility for) updating to dependent objects (observers).<br/>
– Subject only refers to and knows about the common Observer interface for updating state (loose coupling).<br/>
– An open-ended number of observers can be added/removed independently and dynamically (attach(o)/detach(o)).<br/>
– Loosely coupled objects have only minimal dependencies (by working through a common interface), which makes the objects easier to to implement, change, test, and reuse.

### Design Problems
![image](https://drive.google.com/uc?export=view&id=1lROQyKNZqZ_L3agPOQogo9smyBzT8jwm)

• Tight coupling between subject and dependents.<br/>
– Subject implements (is responsible for) updating dependent objects.<br/>
– Subject refers to and knows about (how to update) many different objects having different interfaces (tight coupling).<br/>
– Adding new dependent objects or removing existing ones requires changing subject.<br/>
– Tightly coupled objects depend on (refer to and know about) many other objects having different interfaces, which makes the objects hard to implement, change, test, and reuse.