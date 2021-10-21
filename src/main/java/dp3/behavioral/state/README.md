# State Pattern
### Definition
Allow an object to change its behavior when its state changes.
- The object will appear to change its class.

# Solution Diagram

![image](https://drive.google.com/uc?export=view&id=1pjFj31bhubLPknHd5wGD8g4yI7hA3a5l)

• Encapsulated state-specific behavior.<br/>
– The behavior for each state is implemented (encapsulated) in a separate class
(State1,State2,…).<br/>
– This makes it easy to add new states or change the behavior of existing states independently
from (without having to change) the Context class.<br/>

• No conditional statements required.<br/>
– Conditional statements are replaced by delegating to different State objects.<br/>

• Simplified classes.<br/>
– Classes that delegate an  state-specific behavior get less complex and easier to implement, change, test,
and reuse.

### Design Problems

![image](https://drive.google.com/uc?export=view&id=11jWBomZwR4dMYpZSVTSJ3Af6S95oNysK)

• Hard-wired state-specific behavior.<br/>
– The behavior of different states is implemented (hard-wired) directly within a class
(Context).<br/>
– This makes it impossible to add new states or change the behavior of existing states
independently from (without having to change) the Context class.<br/>

• Conditional statements required.<br/>
– Conditional statements are needed to switch between different states.<br/>

• Complicated classes.<br/>
	– Classes that include multiple states-specific behavior get more complex and harder to implement, change,
test, and reuse.

