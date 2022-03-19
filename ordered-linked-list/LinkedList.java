package orderedlinkedlist;

public class LinkedList {

	Node first = null;
	
	public LinkedList() {
		first = new Node();
	}
	
	public boolean isEmpty() {
		return first.getLink()==null;
	}
	
	public void addItem(String item) {
		Node current = first;
		while(current.getLink()!=null) {
			current = current.getLink();
		}
		
		Node newItem = new Node(item);
		current.setLink(newItem);
		
	}
	public boolean removeHasMiddeWith(char x) {
		int count = 0;
		String item;
		if(!isEmpty()) {
			Node current = first.getLink();
			Node previous = first;			
			
			while(current == first.getLink() || current.getLink()!=null) {				
				
				item = current.getItem();
				
				char[] arr = item.toCharArray();
				int index = (arr.length-1)/2;
				char middle = arr[index];
				if(middle==x) {
					previous.setLink(current.getLink());
					count++;
				}
				
				current = current.getLink();
				previous = previous.getLink();
			}
			
			
			
		}
		if(count!=0)
			return true;
		else
			return false;
	}
	
}
