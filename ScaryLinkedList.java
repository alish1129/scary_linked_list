import java.io.File;
import java.util.Scanner;

public class ScaryLinkedList {

	
	public static void main(String args[]){
		Node myNode = new Node();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the txt file that you want to access.");
		String input = scan.next();
		File file = new File(input);
		Node spot, temp;
		String name;
		try
		{
			Scanner myScan = new Scanner(file);
			while(myScan.hasNextLine())
			{
				name = myScan.nextLine();
				if(myNode.front == null)
				{
					myNode.front = myNode.makeNode(name);
				}
				else
				{
					spot = myNode.findSpot(name);
					if (spot == myNode.front) 
					{
						temp = myNode.front;
						myNode.front = myNode.makeNode(name);
						myNode.front.next = temp;
					}
					else
					{
						myNode.InsertAfter(spot, name);
					}
				}
			}
		}
		catch (Exception e) 
		{
			System.out.println("Error!! "+e);
		}
		boolean showOptions = true;
		while(showOptions){
		System.out.println("What do you want to do, today?\n"
				+ "1. View the current list (Press 1)\n"
				+ "2. Find out the length of the current list (Press 2)\n"
				+ "3. Delete an entry from the list (Press 3)\n"
				+ "4. Request the length of a section of the list (Press 4)\n"
				+ "5. Print out sections of names. (Press 5)\n"
				+ "6. EXIT.");
		int selection = scan.nextInt();
		
		if(selection == 1) 
		{
			showList(myNode);
		}
		else if(selection == 2) 
		{
			System.out.println("The length of the current list is: "+	myNode.length());
		}
		else if(selection == 3) 
		{
			deleteAfter(myNode);
		}
		else if(selection == 4) 
		{
			selectedListLength(myNode);
		}
		else if(selection == 5) 
		{
			selectedList(myNode);
		}
		else
		{
			System.out.println("Have a nice day! Thank you.");
			showOptions = false;
		}
		}
	}

	private static void selectedListLength(Node myNode) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the alphabet whose list length you want. ");
		String letter = scan.next();
		char l = letter.charAt(0);
		Node curr = myNode.front;
		int x = 0;
		while(curr.next != null){
			if(curr.data.charAt(0) == l) {
				x++;
			}
			curr= curr.next;
		}
			System.out.println("The total number of names that start with "+letter+ " is: "+ x);
		scan.close();
		}

	private static void selectedList(Node myNode) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the alphabet whose list you want. ");
		String letter = scan.next();
		char l = letter.charAt(0);
		Node curr = myNode.front;
		System.out.println("This is the total list of people whose name start from "+letter);
		while(curr.next != null){
			if(curr.data.charAt(0) == l) {
			System.out.println(curr.data);	
			}
			curr= curr.next;
		}
		scan.close();
	}

	public static void deleteAfter(Node myNode) {
		Scanner scan = new Scanner(System.in);
		Node curr = myNode.front;		
		System.out.print("Enter the name you want to delete: \n");
		String name = scan.next();
		int x= 0;
		System.out.println(name+ " has been deleted from the system.");
		
		while(curr.next != null) {
			if(name.toLowerCase().equals(curr.next.data)) {
				myNode.deleteAfter(curr);
				System.out.println("The list length after the removal of "+name+" is: "+myNode.length());
				System.out.println("\nUpdated list after the removal of "+ name+".");
				showList(myNode);
			} else {
				curr = curr.next;
			}
		}
		scan.close();
	}
	
	public static void addNodeAtEndOfList(Node myNode, String nextLine) {
		Node tail;
		tail = myNode.findTail(myNode.front);
		tail.next = myNode.makeNode(nextLine);
	}

	public static void showList(Node myNode) {
		Node curr = myNode.front;			
		while (curr.next != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
}

