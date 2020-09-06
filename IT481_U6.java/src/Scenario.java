import java.util.Scanner;

public class Scenario 
{
	static int items;
	static int controlItemNumber;
	static int numberOfItems;
	static int totalRooms;
	static int numberOfCustomers;
	
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What ClothingItems value do you want? (0 = random)");
		controlItemNumber = in.nextInt();
		
		System.out.print("How many customers do you want?");
		numberOfCustomers = in.nextInt();
		
		System.out.print("How many dressing rooms do you want?");
		totalRooms = in.nextInt();
		
		in.close();
		
		DressingRoom dr = new DressingRoom(totalRooms);
		
		for(int i=0; i<numberOfCustomers; i++)
		{
			
			Customer cust = new Customer(controlItemNumber);
			
			numberOfItems = cust.getNumberOfItems();
			
			items += numberOfItems;
			
			dr.RequestRoom(numberOfItems);
			
		}
		
		
		
		try
		{
			Thread.sleep(2000);
		}
		
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
		int averageItemsPerCustomer = items/numberOfCustomers;
		
		System.out.println("Average number of items was: " + averageItemsPerCustomer);
		
		System.out.println("Average Run time in nanoseconds " + dr.getRunTime()/numberOfCustomers);
		
		System.out.println("Average Wait time in nanoseconds " + dr.getWaitTime()/numberOfCustomers);
		
		System.out.println("Total customer is " + numberOfCustomers);
				
	}
	

}
