import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ListStudent list = new ListStudent();
		Student a = new Student();
		int luachon=1;
		do {
			System.out.println("1. Add Student");
			System.out.println("2. Edit Student by Id");
			System.out.println("3. Delete Student by Id");
			System.out.println("4. Sort Student by GPA");
			System.out.println("5. Sort Student by name");
			System.out.println("6. Show Student");
			System.out.println("0. Exit");
			System.out.print("Enter: "); luachon = scanner.nextInt();
			if(luachon==1) {
				list.addStudent(a.input());
			}else if (luachon==2) {
				System.err.println("Enter Id change: "); String idTemp = scanner.next();
				list.editSudent(idTemp);
			}else if (luachon==3) {
				System.err.println("Enter Id change: "); String idTemp = scanner.next();
				list.deleteStudent(idTemp);
			}else if (luachon==4) {
				list.sortByGPA();
			}else if (luachon==5) {
				
			}else if (luachon==6) {
				list.showStudent();
			}
		} while (luachon!=0);
		
	}
}
