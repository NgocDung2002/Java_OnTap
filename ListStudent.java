import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListStudent implements StudentManager {
	private List<Student> listStudents;
	
	public ListStudent() {
		listStudents = new ArrayList<>();
	}

	public ListStudent(List<Student> listStudents) {
		this.listStudents = listStudents;
	}

	@Override
	public void addStudent(Student a) {
		listStudents.add(a);
	}

	@Override
	public void editSudent(String id) {
		int check=0;
		for (int i=0; i<listStudents.size(); i++) {
			if(listStudents.get(i).getId().equals(id)) {
				Student a = new Student().input();
				listStudents.set(i, a);
				check=1;
				break;
			}
		}
		if (check==0) {
			System.out.println("Khong co id " + id + "can sua. ");
		}else if(check==1)
			System.out.println("Cap nhap thanh cong");
	}

	@Override
	public void deleteStudent(String id) {
		int check = 0;
		for(int i=0; i<listStudents.size(); i++) {
			if(listStudents.get(i).getId().equals(id)) {
				listStudents.remove(i);
				check=1;
				break;
			}
		}
		if (check==0) {
			System.out.println("Khong co id " + id + "can xoa. ");
		}else if(check==1)
			System.out.println("Xoa thanh cong");
		
	}

	@Override
	public List<Student> sortByGPA() {
		Collections.sort(listStudents);
		return listStudents;
	}

	@Override
	public List<Student> sortByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showStudent() {
		for (Student student : listStudents) {
			System.out.println(student.toString());
		}
	}
	
	
	
}
