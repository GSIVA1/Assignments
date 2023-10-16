package Player;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Permanent p=new Permanent(15,"Shiva",15000,"Analyst",5);
		p.calculateSalaryHike();
		
		Temporary t=new Temporary(20,"Praveen",10000,1.5);
		t.calculateSalaryHike();

	}

}
