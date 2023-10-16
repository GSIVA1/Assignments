package Player;

public class User {
	/* create a class User
           uid,uname,email
           walletBalance

             makePayment(double amt)

 

    create a class PremiumUser extends User
              int rewardPoint

                       makePayment(double amt)

 

 

  task which u have to perform

 

 

   Congratulation Deepak, payment of Rs 70 was done succesfully
   your wallet balance is Rs 500.

 

   Congratulation Rani, payment of Rs 50 was done succesfully
   your wallet balance is Rs 800.
   you have 20 points

 

   Sorry Vinod you do not have enough balance to pay the bill
  your walle balance is Rs 50
  you have 30 points */
	
	private int uid;
	private String uname;
	private String email;
	private int walletBalance;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(int walletBalance) {
		this.walletBalance = walletBalance;
	}
	public User(int uid, String uname, String email, int walletBalance) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
		this.walletBalance = walletBalance;
	}
	public User() {
		super();
	}
	
	public void makePayment(double amt) {
		System.out.println();
	}

	
	
	

}
