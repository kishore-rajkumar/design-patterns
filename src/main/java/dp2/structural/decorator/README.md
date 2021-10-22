# Decorator Pattern

###Definition

Attach additional responsibilities to an object dynamically.<br/>
- Decorators provide a flexible alternative to sub-classing for extending functionality.

 
# Solution Diagram

![image](https://drive.google.com/uc?export=view&id=14FpFwqh2MDxghttlF25UNolgVKtu1GfL)

 - Extending functionality at run-time.<br/>
	– Decorator objects implement additional responsibilities.<br/>
	– Clients can work through different Decorator objects to add different responsibilities at run-time.<br/>
 - Recursively nested decorators.<br/>
	– Extending functionality by decorators requires creating a new decorator for each new functionality but not for each new combination of functionalities.<br/>
	– Decorators can be nested recursively for supporting an open-ended number of functionalities and their combinations.<br/>

### Design Problems

![image](https://drive.google.com/uc?export=view&id=1NNjjbTV_6oGHF83NQ6yGskvn6d-1CWe0)

 - Extending functionality at compile-time.<br/>
	– Subclasses implement additional responsibilities.<br/>
	– Once a subclass is instantiated, the responsibility is bound to the instance for its life-time and can't be changed at run-time.
	
- Explosion of subclasses.<br/>
	– Extending functionality by subclassing requires creating a new subclass for each new functionality and for each new combination of functionalities.<br/>
	– Supporting a large number of functionalities and their combinations would produce an explosion of subclasses.




