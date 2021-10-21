# Adapter Pattern

###Definition

Convert an interface of a class into another the client expects.<br/>
-- Adapter lets class work together that coudn't otherwise due to incompatible interfaces.

Two Types - 
 - Class Adapter - inheritance
 - Object Adapter - Composition
 
 
# Solution Diagram

![image](https://drive.google.com/uc?export=view&id=1cbCF22LROZ8fYwfoBADNHFSxF85V8r25)

 - Working through an adapter.<br/>
	 - Clients can reuse Adaptee.<br/>
	 - Clients that require (depend on) a Target interface can reuse Adaptee by working through an Adapter.<br/>

### Design Problems

![image](https://drive.google.com/uc?export=view&id=12MsBTzXrwZZQCuME9A0CewnzzD76KQZT)

 - No adapter.<br/>
 	- Clients can not reuse Adaptee.<br/>
 	- Clients that require (depend on) a Target interface can not reuse Adaptee only because its interface doesn't conform to the Target interface.


