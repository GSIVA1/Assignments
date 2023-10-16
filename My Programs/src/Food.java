
public class Food {
	/*class Food {
        fid,fname cusine, type, price;*/
	
	private int fid;
	private String fname;
	private String cusine;
	private String type;
	private int price;
	public Food(int fid, String fname, String cusine, String type, int price) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.cusine = cusine;
		this.type = type;
		this.price = price;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCusine() {
		return cusine;
	}
	public void setCusine(String cusine) {
		this.cusine = cusine;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [fid=" + fid + ", fname=" + fname + ", cusine=" + cusine + ", type=" + type + ", price=" + price
				+ "]";
	}
	
	
	


}
