# Singleton Pattern

###Definition

Ensure the class has only one instance and provide a global access point to it.

# Solution Diagram

![image](https://drive.google.com/uc?export=view&id=1C5Q67cdZyKvKQEKGXSKvFiweTT7DMctF)

• Only one instance possible.<br/>
– The class hides its constructor (private Singleton() {}).<br/>
– A static operation (getInstance()) provides the sole instance of the class.<br/>
– A public static operation is easy to access from anywhere by using the class name and operation name (Singleton.getInstance()).<br/>

### Design Problems

![image](https://drive.google.com/uc?export=view&id=1dHYyOW8-EJSqjsOLAI8Wbb2nWdyqL5YI)

• Multiple instances possible.<br/>
– The class provides a public constructor (public Class() {}).<br/>
– Clients can call the public constructor of a class each time a new object is needed.



