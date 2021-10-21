# Strategy Pattern
### Definition
Define a family of algorithm, encapsulate each one and make them interchangeable.
- Strategy lets the algorithm vary independently from the clients that uses it.

# Solution Diagram

![image](https://drive.google.com/uc?export=view&id=1TTqZO2kIu-KLWZhxEiK8ctDqufR8Y-9f)

- Encapsulated algorithms.<br/>
– Each algorithm is implemented (encapsulated) in a separate class (Strategy1,Strategy2,
…).<br/>
– This makes it easy to add new algorithms or change existing ones independently from
(without having to change) the Context class.<br/>
• No conditional statements required.<br/>
– Conditional statements are replaced by delegating to different Strategy objects.<br/>
• Simplified classes.<br/>
– Classes that delegate an algorithm get less complex and easier to implement, change, test,
and reuse.

### Design Problems

![image](https://drive.google.com/uc?export=view&id=14n4Ok8YHBUvczSp6e-3C-r15keH11mw7)

- Hard-wired algorithms.<br/>
	– Different algorithms are implemented
(hard-wired) directly within a class (Context).<br/>
	– This makes it impossible to add new algorithms or change existing ones independently from
(without having to change) the Context class.<br/>
• Conditional statements required.<br/>
	– Conditional statements are needed to switch between different algorithms.<br/>
• Complicated classes.<br/>
	– Classes that include multiple algorithms get more complex and harder to implement, change,
test, and reuse.

