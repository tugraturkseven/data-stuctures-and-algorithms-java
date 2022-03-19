package linkedlist;


public class MyLinkedList {
	
	private MyNode root;
	
	
	public MyLinkedList() {
		this.root = new MyNode(null);
	}
	
	public void addStudent(Student student) {
		if(root==null) {
			MyNode newNode = new MyNode(student);
			root.next = newNode;
		}else {
			MyNode current = root;
			
			while(current.next!=null) {
				current = current.next;
			}
			MyNode newNode = new MyNode(student);
			current.next = newNode;
		}

	}
	
	public void searchGpa(double gpa) {
		if(root!=null) {
			MyNode current = root;
			while(current.next!=null) {
				
				current = current.next;
				double studentGpa = current.getStudent().getGpa();
				if(studentGpa>gpa)
					System.out.println(current.getStudent().getFullName()+" "+studentGpa);
				
			}
		}
	}
	
	public void printData() {
		if(root!=null) {
			
			MyNode current = root;
			int id;
			String fullName;
			double gpa;
			while(current.next!=null) {
				current = current.next;
				id = current.getStudent().getId();
				fullName = current.getStudent().getFullName();
				gpa = current.getStudent().getGpa();
				System.out.println(id+ " "+fullName+" "+gpa);

			}
		}
	}
	
	public MyNode addStudentToGivenPosition(int position, Student data) {
		MyNode current = root;
		MyNode previous = current;
		Student newStudent = data;
		int location = 0;
		
		if(current.next!=null) {
			while(current.next!=null) {
				while(location<position) {
					current = current.next;
					if(location!=0)
						previous = previous.next;
					location++;
				}
				MyNode newNode = new MyNode(newStudent);
				previous.next = newNode;
				newNode.next = current;
				return newNode;
				
			}
		}
		return null;
	}
	
	public void addStudentToFront(Student student) {
		MyNode current = root;
		if(current.next!=null)
			current = current.next;
		MyNode newNode = new MyNode(student);
		root.next = newNode;
		newNode.next = current;
	}
	
	public void deleteStudent(Student student) {
		Student current;
		MyNode previous = root;
		MyNode iterator = root;
		if(iterator.next!=null) {
			iterator = iterator.next;
			while(iterator.next!=null) {
				current = iterator.getStudent();
				if(current == student) {
					iterator = iterator.next;
					previous.next = iterator;
					break;
				}
				iterator = iterator.next;
				previous = previous.next;
			}
		}
		
	}
}
