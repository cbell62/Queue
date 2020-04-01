/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Calista
 */
public class LinkedQueue {
  
    private Customer head, tail;
    
    int totalCustomers = 0;
    int currentCustomers = 0;
    
    public LinkedQueue()
    {
    head = tail = null;
    }
    
    public boolean Empty()
    {
        return head == null;
    }
    
    public void enqueue(Customer c)
    {
        if(Empty())
        {
           head = c;
        }
        else
        {
            tail.setNext(c);
        }
        
            tail = c;
            
                totalCustomers++;
            
                    currentCustomers++;
    }
    
    public Customer dequeue()
    {
        if(Empty())
        {
            return null;
        }
        
        Customer temporary = head;
        
            head = head.getNext();
            
        if(Empty())
        {
            tail = null;
        }
        
        currentCustomers--;
    
        
        return temporary;
        }
    
        public Customer frontofLine()
        {
            if(Empty())
            {
                return null;
            }
                return head;
        }
        
        public int gettotalCustomers()
        {
            return totalCustomers;
        }
        
        public int getcurrentCustomers()
        {
            return currentCustomers;
        }
        
      }
        
        
        

