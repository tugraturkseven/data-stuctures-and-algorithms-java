package linkedlist;

public class Test {

	public static void main(String[] args) {
		Student tugra = new Student(1803127,"Tu�ra T�rkseven",2.06);
		Student merve = new Student(1803128,"Mervenur Ge�ici",2.56);
		Student melisa = new Student(1803129,"Melisa I��kdemir",2.46);
		
		MyLinkedList linkedList = new MyLinkedList();
		
		linkedList.addStudent(tugra);
		linkedList.addStudent(melisa);
		linkedList.addStudent(merve);
		
		linkedList.searchGpa(1.00);
		System.out.println("--------------------------------------------------");
		linkedList.printData();
		System.out.println("--------------------------------------------------");
		linkedList.addStudentToGivenPosition(2, tugra);
		linkedList.printData();
		System.out.println("--------------------------------------------------");
		linkedList.addStudentToFront(merve);
		linkedList.printData();
		System.out.println("--------------------------------------------------");
		linkedList.deleteStudent(tugra);
		linkedList.printData();
	}
}
