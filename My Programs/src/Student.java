
public class Student {
	// u create a object of student

			// calculte the total fees of the student

			// 101 Bharat 
			 // 801 Java 2000
			 // 802 C 1000
			// 803 C++ 4000


			// output
			 // 101 Bharat 
			 // 801 Java 2000
			 // 802 C 1000
			// 803 C++ 4000

			// Total fees Rs 7000/- pls pay the fees and enjoy the course
	
	private int sId;
	private String sname;
	private Course sub[];
	public Student(int sId, String sname, Course[] sub) {
		super();
		this.sId = sId;
		this.sname = sname;
		this.sub = sub;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sname=" + sname + "]";
	}
	
	
    

}
