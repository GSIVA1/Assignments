
public class AdultUser implements LibraryUser{
	int age;
	public void registerAccount(int age) {
		
		if (age > 12) {
			System.out.println(“\nYou have successfully registered under an Adult Account”);
		}else {
			System.out.println(“Sorry, Age must be greater than 12 to register as an adult”);
		}
		this.age=age;
	}
	

		public void requestBook(String bname) {
		if(bname==“Fiction" && age>12){"
				 System.out.println(\n“Book Issued successfully, please return the book within 7 days”);
		}else{
			System.out.println(\n“Oops, you are allowed to take only adult Fiction books”);

	}
	
	

}
