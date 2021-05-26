# Linked Queue Programming Assignment for 2214 (Data Structures and Algorithms)
- **Term Taken: Spring 2020**
- Write a program that simulates customers waiting in line at a grocery store.  Your program must use a Queue to represent the customer objects waiting in line. 

- The program (driver) should simulate 60 minutes of activity at the store. 
1. Each iteration of your program should represent one minute.  
2. At each iteration (minute), your program should do the following:•Check to see if new customers are added to the queue.
3. There is a 25% chance that new customers show up (need to be added to the queue) every minute. 
4. This does not mean you should add a customer every four iterations, but rather each iteration should have its own 25% chance.
5. Update the customer object currently being serviced (if one exists).  This will be the customer object at the front of the queue. 
6. If the customer has been completely serviced, remove them from the queue.

- During execution, your program should output the following information:•
1. When a new customer is added to the queue, output, “New customer added! 
2. Queue length is now X” where X is the size of the queue after the new customer has been added.
3. When a customer has been completely serviced, output, “Customer serviced and removed from the queue. 
4. Queue length is now X” where X is the size of the queue after the customer has been removed.
5. At the end of each iteration (minute), output, “---------------------------------------------------“  to visually identify the passing of time.
6. When your simulation ends, your program should also output the following information:
   1. Total number of customers serviced
   2. Maximum line length during the simulation
