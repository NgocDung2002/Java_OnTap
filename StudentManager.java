import java.util.List;

public interface StudentManager {
	public void addStudent(Student a);
	public void editSudent(String id);
	public void deleteStudent(String id);
	public List<Student> sortByGPA();
	public List<Student> sortByName();
	public void showStudent();
}
