# Facade Pattern

###Definition

Provide an unified interface to a set of interfaces in a subsystem.<br/>
- Facade defines a higher-level interface that makes the subsystem easier to use.

 
# Solution Diagram

![image](https://drive.google.com/uc?export=view&id=1tGAe6nhNdet59A1ep-WkH5UWF4Ovg2PV)

 - Working through a facade.<br/>
	Loose coupling between client and subsystem.<br/>
		– Clients only refer to and know about (depend on) the simple Facade interface, which makes clients easier to implement, change, test, and reuse.<br/>
		– Clients do not have to be changed when interfaces in the subsystem are added or extended.<br/>

### Design Problems

![image](https://drive.google.com/uc?export=view&id=1K1tM6Gs6d2x5XFY_Szbv0lpEEAal7Een)

  - No facade / direct access.<br/>
		Tight coupling between client and subsystem.<br/>
			– Clients refer to and know about (depend on) many different interfaces in the subsystem, which makes clients harder to implement, change, test, and reuse.<br/>
			– Clients must be changed when interfaces in the subsystem are added or extended.<br/>



