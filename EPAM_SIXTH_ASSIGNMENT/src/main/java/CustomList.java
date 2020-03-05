import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomList 
{
	public static Logger LOGGER = LogManager.getLogger(CustomListCreation.class);
	static Scanner sc=new Scanner(System.in);
	public static int menu()
	{
		
		int query=0;
		System.out.println("The following are the Operation that can be done on the list");
		System.out.println("1) Adding Elements at last");
		System.out.println("2) Adding Elements at required Location");
		System.out.println("3) Set Elements at required Location");
		System.out.println("4) Removing element for required Locaiton");
		System.out.println("5) Get Element from required Locaiton");
		System.out.println("6) Get First Element of the List");
		System.out.println("7) Get Last Element of the List");
		System.out.println("8) Get size of the List");
		System.out.println("9) Printing the Complete List");
		query=sc.nextInt();
		
		return query;
	}
	public static void main(String args[])
	{
		Object defaultArray[]= {"0","1","2","3","4","5","6","7","8","9"};
		
		CustomListCreation customList=new CustomListCreation(defaultArray);
		
		int index;
		Object element;
		Object required;
		String choice="yes";
		
		while(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"))
		{
			switch(menu())
			{
				case 1:
					System.out.println("------- Adding Elements at last -------");
					
					System.out.println("Enter a element to insert: ");
					element = sc.next();
					
					customList.append(element);
					LOGGER.info("Element inserted");
					break;
				case 2:
					System.out.println("------- Adding Elements at required Location -------");
					System.out.print("Enter the location where you need to insert: ");
					index=sc.nextInt();
					
					System.out.print("Enter the element: ");
					element=sc.next();
					
					customList.insertElement(index, element);
					LOGGER.info("Element inserted at required location");
					break;
				case 3:
					System.out.println("------- Set Elements at required Location -------");
					
					System.out.print("Enter the index and new element that need to be inserted:");
					index = sc.nextInt();
					element = sc.next();
					
					customList.setListElement(index,element);
					LOGGER.info("Element updated");
					break;
				case 4:
					System.out.println("------- Removing element for required Locaiton -------");
					System.out.print("Enter the required location: ");
					index=sc.nextInt();
					element=customList.remove(index);
					
					System.out.println("The removed element is: "+element);
					LOGGER.info("Removed the element");
					break;
				case 5:
					System.out.println("------- Get Element from required Locaiton -------");
					
					System.out.print("Enter the required location: ");
					index = sc.nextInt();
					
					required = customList.get(index);
					
					System.out.println("Required Element is: "+required);
					LOGGER.info("Retrived Successfully");
					break;
				case 6:
					System.out.println("------- Get First Element of the List -------");
					
					required=customList.getFirstElement();
					System.out.println("Required Element is: "+required);
					LOGGER.info("Retrived Successfully");
					break;
				case 7:
					System.out.println("------- Get Last Element of the List -------");
					
					required=customList.getLastElement();
					System.out.println("Required Element is: "+required);
					LOGGER.info("Retrived Successfully");
					break;
				case 8:
					System.out.println("------- Get size of the List -------");
					int size = customList.size();
					System.out.println("The size of the list is: "+size);
					LOGGER.info("Retrived Successfully");
					break;
				case 9:
					System.out.println("------- Printing the Complete List -------");
				
					List list = customList.getCompleteList();
					System.out.println("The List is: "+list);
					LOGGER.info("Displayed Successfully");
					break;
				default:
					System.out.println("Enter your requirement for the given list");
					menu();
					break;	
			}
			System.out.println("Do you want to continue (yes/no)?");
			choice = sc.next();
		}
	}

}
