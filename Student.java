import java.util.Scanner;

public class Student implements Comparable<Student> {
	private String id, name, address;
	private int age;
	private double gpa;
	
	public Student() {
		
	}
	
	public Student(String id, String name, int age, String address, double gpa) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.gpa = gpa;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	Scanner scanner = new Scanner(System.in);
	public Student input() {
		System.out.print("Enter ID: "); String id = scanner.nextLine();
		System.out.print("Enter Name: "); String name = scanner.nextLine();
		System.out.print("Enter Address: "); String address = scanner.nextLine();
		System.out.print("Enter Age: "); int age = scanner.nextInt();
		System.out.print("Enter GPA: "); double gpa = scanner.nextDouble();
		Student tempStudent = new Student(id, name, age, address, gpa);
		return tempStudent;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + address + " " + age + " " + gpa;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (int)this.getGpa() - (int)o.getGpa();
	}
	
	
}
