# Chain of Responsibility Pattern
### Definition
Avoid coupling the sender to a receiver by giving more objects a chance to handle the request.
- Chain the receiving objects and pass along the request  until an object handles it.

# Solution Diagram

![image](https://drive.google.com/uc?export=view&id=1B3hE0TQPocz2JZ6UxaXNtaGYtVEbMwbq)

• Multiple receivers.<br/>
– The request gets passed along a chain of receivers (Handler objects).<br/>
– This decouples the sender from a particular receiver.<br/>
– The sender has no explicit knowledge of the handler (receiver) that ultimately will handle
the request.<br/>
– The chain of handlers can be changed at run-time (handlers can be added to and removed
from the chain).

### Design Problems

![image](https://drive.google.com/uc?export=view&id=1hJbudqvLIVn2IeUW4qxyFq8FJ4B7ZIVt)

• One receiver.<br/>
– The request is sent to a particular receiver (Receiver1 object).<br/>
– This couples the sender to a particular receiver.