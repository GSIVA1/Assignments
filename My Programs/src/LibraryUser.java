
public interface LibraryUser {
	
	/*4.           Library Application

	 

	A library needs to develop an online application for two types of users/roles, Adults and children. 
	Both of these users should be able to register an account.

	 

	Any user who is less than 12 years of age will be registered as a child and they can borrow a “Kids” category book for 10 days, 
	whereas an adult can borrow “Fiction” category books which need to be returned within 7 days.

	 

	Note: In future, more users/roles might be added to the library where similar rules will be enforced.

	 

	Develop Interfaces and classes for the categories mentioned above.  

	 

	1. Create an interface LibraryUser with the following methods declared,
	Method Name
	registerAccount(int age)
	requestBook(String bname)

	 

	Create 2 classes “KidUsers” and “AdultUser” which implements the LibraryUser interface.

	 

	   Both the classes should have two instance variables as specified below.
	Instance variables  Data type
	age                           int
	bookType               String

	 

	 


	The methods in the KidUser class should perform the following logic. 
	registerAccount method:
	if age < 12, a message displaying “You have successfully registered under a Kids Account” should be displayed in the console. 
	If(age>12), a message displaying, “Sorry, Age must be less than 12 to register as a kid” should be displayed in the console.

	 

	requestBook method:

	 

	if bookType is “Kids”, a message displaying “Book Issued successfully, please return the book within 10 days” should be displayed in the console. 
	Else, a message displaying, “Oops, you are allowed to take only kids books” should be displayed in the console.

	 

	  The methods in the AdultUser class should perform the following logic.

	 

	registerAccount  method:
	if age > 12, a message displaying “You have successfully registered under an Adult Account” should be displayed in the console.
	If age<12, a message displaying, “Sorry, Age must be greater than 12 to register as an adult” should be displayed in the console.
	requestBook function:
	if bookType is “Fiction”, a message displaying “Book Issued successfully, please return the book within 7 days” should be displayed in the console.
	Else, a message displaying, “Oops, you are allowed to take only adult Fiction books” should be displayed in the console.

	 

	   Create a class “LibraryInterfaceDemo.java” with a main method which performs the below functions,

	 

	 

	Set the book Type as specified in the below table and invoke the requestBook method of the  AdultUser  object
	BookType
	“Kids”
	“Fiction”

	 

	Sample Input
	    enter the age for kids
	         18
	    enter the book 
	     Kids

	 

	  o/p   oops sorry Age must be less than 12*/
	
	public void registerAccount(int age);
	public void requestBook(String bname);
		
	}


