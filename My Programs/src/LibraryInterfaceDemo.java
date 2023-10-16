
public class LibraryInterfaceDemo {
	
	public static void main(String[] args) {
		KidUsers ks=new KidUsers();
		ks.registerAccount(11);
		ks.requestBook("Friction");
		
		AdultUser at new AdultUser();
		ks.registerAccount(18);
		ks.requestBook("Kids");
				
	}

}
