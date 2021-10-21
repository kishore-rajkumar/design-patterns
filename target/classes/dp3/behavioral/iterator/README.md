# Iterator Pattern
### Definition
Provide a way to traverse and access the elements of an aggregate object (collection) sequentially without exposing the underlying implementation.

# Solution Diagram

![image](https://drive.google.com/uc?export=view&id=1QJFk4Od7SoRnWcIq3pe4L3D2gnyl37y_)


### Design Problems
###### Accessing and Traversing Object Structures
– How can the elements of an aggregate object be accessed and traversed
without exposing its underlying representation?
– How can new traversal operations be defined for an aggregate object
without changing its interface?
###### Performing Different Traversals
– How can different traversals be performed on an aggregate object?
– How can multiple traversals be pending on the same aggregate object (simultaneous traversals)