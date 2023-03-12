import java.util.Objects;

public class Student implements Comparable<Student>{
	private int gpa;
	private String name;
	
	public Student(int gpa, String name) {
		super();
		this.gpa = gpa;
		this.name = name;
	}

	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(gpa, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return gpa == other.gpa && Objects.equals(name, other.name);
	}
	
	
	
}
