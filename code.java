package github;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class code{
	
		@SuppressWarnings({ "rawtypes", "unchecked", "resource", "unused" })
public void priorityqueue()
	{
		
		int n;
		int m;
		int w;
		Scanner scan = new Scanner(System.in);	 
		Queue t1 = new PriorityQueue();
			
			 do
			 {
				 System.out.println("\t Menu "
				 		+ "\n 1.Add an element in the queue"
				 		+ "\n 2.Check for an element"
				 		+ "\n 3.Poll the first element"
				 		+ "\n 4.Peek an element"
				 		+ "\n 5.Display the elements");
				 
				 
				 System.out.println("Choose from the above");
				 n=scan.nextInt();
				 
				 switch(n)
				 {
				 case 1:
					 System.out.println("\n Enter the element");
					 t1.add(m=scan.nextInt());
					 System.out.println("\n Element inserted successfully");
					 break;
					 
					 
				 case 2: 
					 System.out.println("Enter the number you want to verify :");
					 
					 if (t1.contains(w=scan.nextInt()))
					 {
						 System.out.println("The number is there .");
					 }
					 else
					 {
						 System.out.println("The number is not there .");
					 }
					 break;
					
					 
				 case 3:
					 int x = (int) t1.poll();
					 System.out.println("The top removed element was " + x);
					 break;
					 
					 
				 case 4:
					 int z =(int) t1.peek();
					 System.out.println("The peeked  element from the  " + z);
					 break;
					 
					 
				 case 5:
					 try {
					 Iterator itr = t1.iterator();
					 while(itr.hasNext())
					 {
						 System.out.println(itr.next());
					 }
					 }
					 catch(Exception e)
					 {
						 System.out.println("The stack is empty");
					 }
					 break;		 
				 }	 
		}while(n!=6);
			 		
	}
			
		
@SuppressWarnings({ "rawtypes", "unchecked", "resource" })
public void Linkedlist()
			{
				int n;
				int m;
				int w;
				
				Scanner scan = new Scanner(System.in);
				 
				LinkedList t2 = new LinkedList();
				
				 do
				 {
					 System.out.println("\t Menu "
					 		+ "\n 1.Add an element in the Linkedlist"
					 		+ "\n 2.Check for an element in the Linkedlist"
					 		+ "\n 3.Remove the first element from the Linkedlist"
					 		+ "\n 4.Peek the first element from the Linkedlist"
					 		+ "\n 5.Display the last element in the Linkedlist"
					 		+ "\n 6.Display all the elements in the Linkedlist"
					 		+ "\n 7.Exit");
					 
					 
					 System.out.println("\n Select from the menu");
					 n=scan.nextInt();
					 
					 switch(n)
					 {
					 case 1:
						 System.out.println("\n Enter the element");
						 t2.add(m=scan.nextInt());
						 System.out.println("\n Element " + m + " has been inserted in the Linked");
						 break;
						 
					 case 2: 
						 System.out.println("Enter the number you want to verify :");
						 
						 if (t2.contains(w=scan.nextInt()))
						 {
							 System.out.println("Number " + w + " is found in the Linkedlist");
						 }
						 else
						 {
							 System.out.println("The number is not there .");
						 }
						 break;
						
					 case 3:
						 int x = (int) t2.pop();
						 System.out.println("Element " + x + " was  popped from the Linkedlist");
						 break;
						 
					 case 4:
						 int z =(int) t2.getFirst();
						 System.out.println(z + " is the first element in the Linkedlist");
						 break;
						 
					 case 5:
						 int s = (int )t2.getLast();
						 System.out.println("Element " + s + " is the last element in the Linkedlist");
						 break;
						 
					 case 6:
						 try {
						 Iterator itr = t2.iterator();
						 while(itr.hasNext())
						 {
							 System.out.println(itr.next());
						 }
						 }
						 catch(Exception e)
						 {
							 System.out.println("The Linkedlist is empty");
						 }
						 break;
					 }	 
			}while(n!=7);
	}

@SuppressWarnings({ "rawtypes", "unchecked" })
public void stack()
			{
				int n;
				int m;
				int w;
				
				Scanner scan = new Scanner(System.in);
				 
				Stack t2 = new Stack();
				
				 do
				 {
					 System.out.println("\t Menu "
					 		+ "\n 1.Add an element in the stack"
					 		+ "\n 2.Check for an element in the stack"
					 		+ "\n 3.Remove the first element from the stack"
					 		+ "\n 4.Peek the first element from the stack"
					 		+ "\n 5.Display the last element in the stack"
					 		+ "\n 6.Display all the elements in the stack"
					 		+ "\n 7.Exit");
					 
					 
					 System.out.println("\n Select from the menu");
					 n=scan.nextInt();
					 
					 switch(n)
					 {
					 case 1:
						 System.out.println("\n Enter the element");
						 t2.push(m=scan.nextInt());
						 System.out.println("\n Element " + m + " has been inserted in the stack");
						 break;
						 
					 case 2: 
						 System.out.println("Enter the number you want to verify :");
						 
						 if (t2.contains(w=scan.nextInt()))
						 {
							 System.out.println("Number " + w + " is found in the stack");
						 }
						 else
						 {
							 System.out.println("The number is not there .");
						 }
						 break;
						
					 case 3:
						 int x = (int) t2.pop();
						 System.out.println("Element " + x + " was  popped from the stack");
						 break;
						 
					 case 4:
						 int z =(int) t2.firstElement();
						 System.out.println(z + " is the first element in the stack");
						 break;
						 
					 case 5:
						 int s = (int )t2.lastElement();
						 System.out.println("Element " + s + " is the last element in the stack");
						 break;
						 
					 case 6:
						 try {
						 Iterator itr = t2.iterator();
						 while(itr.hasNext())
						 {
							 System.out.println(itr.next());
						 }
						 }
						 catch(Exception e)
						 {
							 System.out.println("The queue is empty");
						 }
						 break;
					 }	 
			}while(n!=7);
			scan.close();
	}
		
}