public class Node {
	public String data;
	public Node next;
	public Node front;

	
 public void init()
	{
		front = null;
	}
	
 public Node makeNode(String data)
 {
 	Node newNode;
 	newNode = new Node();
 	newNode.data = data;
 	newNode.next = null;

 	return newNode;
 }
 
 public Node findTail(Node front)
 {
 	Node current;

 	current = front;
 	while(current.next != null) {
 		current = current.next;
 	}
 	return current;
 }
 
 public void addAtEndOfList(Node at, String data)
 {
 	Node tail;

 	if (front == null) {
 		front = makeNode(data);
 	}
 	else {
 		tail = findTail(at);
 		tail.next = makeNode(data);
 	}
 }

 public void InsertAfter(Node at, String data)
 {
 	Node newNode;

 	newNode = makeNode(data);

 	newNode.next = at.next;
 	at.next = newNode;
 }
 
 public void deleteAfter(Node spot)
 {
 	Node nextNode;

 	nextNode = spot.next;
 	spot.next = nextNode.next;
 }

 public Node findSpot(String s)
 {
 	Node curr, prev;

 	curr = front;
 	prev = curr;
 	while((curr.next != null) && (curr.data.compareTo(s) < 0)) 
 	{
 		prev = curr;
 		curr = curr.next;
 	}
 
 	return prev;
 }


 public int length() {
	   int size = 0;
	   Node n;
	   for( n = front; n.next != null; n = n.next)
	   {
	       size++;     
	   }
	   size++;
	   return size;
	}

public void delete(Node curr)
	{
		curr = curr.next;
	}
 
}
