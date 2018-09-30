# cmpe202


For this problem, The two design patterns used are: 1.Observer pattern and chain of responsibility

The CRC cards are as following:
- Restaurant
- Restaurant Manager
- Table
- Customer

Collaboration diagram:
- Collaboration_diagram

Basic Flow of the process
-customer sign-up on the wait list
-Restaurant sends a notification(here using text message) on successful registration
-When table becomes available, Restaurant Manager is informed.
-Restaurant manager then informs Restaurant which will find the first customer in line which can be accommodated by the table.
-Restaurant then notifies the customer that table is now available
-Customer can confirm or leave the table.
-Table is assigned to the customer

Design Patterns:
1. Observer pattern:
Table here acts as subject in observer pattern and restaurant manager acts as observer. When table becomes available, it notifies the restaurant manager

2.  Chain of responsibility:
Here restaurant manager and restaurant implements chain of responsibility. Restaurant manager acts as client and restaurant acts as concrete handlers (using customer objects). When table becomes available, restaurant manager triggers chain of responsibility implementation(allocation table to customer). Here, it checks if the customer object (which has size of group) will be accommodated on the given table.  If group cannot be accommodated, it goes ahead and checks with the next customer object until it finds the customer which can be accommodated on the given table. This customer is then notified. Customer can now leave or confirm this table.

