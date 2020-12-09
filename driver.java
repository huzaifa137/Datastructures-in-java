package github;

import java.util.Scanner;

public class driver {
	
	public static void main(String args[])
	{		
		
		Scanner scan = new Scanner(System.in);
		
		det d1 = new det();
		
		int n;
		do
		{
			
			System.out.println("\t Menu ");
			System.out.println("1. Priority Queue");
			System.out.println("2. Linkedlist");
			System.out.println("3. stack");
			System.out.println("4. exit");
			
			System.out.println("Enter your choice");
			n=scan.nextInt();
			
			switch(n)
			{
			case 1:
				d1.priorityqueue();
				break;
				
			case 2:
				d1.Linkedlist();
				break;
				
			case 3:
				d1.stack();
				break;
				
			case 4:
				System.out.println("Select one of the above suggestions");
				break;
			}
			
		}while(n!=4);	
		
		scan.close();
	}
	
}
