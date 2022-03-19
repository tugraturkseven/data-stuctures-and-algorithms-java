package stack;

public class Stack {

	private int size;
	private int top = -1;
	private int[] chArray;
	
	public Stack(int size) {
		this.size = size;
		chArray = new int[size];
		
	}

	public boolean isEmpty() {
		if(size==0)
		return true;
		else
			return false;
	}
	
	public boolean push(int i) {
		chArray[++top]=i;
		return true;
	}
	
	public int pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			
		}else {
			size--;
			return chArray[top--];
		}
		
		return ' ';
	}
	
	public String reverse(String str) {
		String reversed ="";
		char[] strToChar= new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			strToChar[i]=str.charAt(i);
		}
		Stack stack = new Stack(str.length());
		for (int i = 0; i < strToChar.length; i++) {
			stack.push(strToChar[i]);
		}
		for (int i = 0; i < strToChar.length; i++) {
			int popped = stack.pop();
			reversed = reversed + popped;
		}
		
		return reversed;
	}
}
