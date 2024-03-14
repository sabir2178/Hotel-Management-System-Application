package entity;

public class Customer {
	private int cId;
	private String cname;
	private long phno;
	private Address a;
	private String roomType;
	private double roomPrice;
	private int roomNo;
	public Customer(int cId, String cname, long phno, Address a, String roomType, double roomPrice, int roomNo) {
		super();
		this.cId = cId;
		this.cname = cname;
		this.phno = phno;
		this.a = a;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomNo = roomNo;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cname=" + cname + ", phno=" + phno + ", a=" + a + ", roomType=" + roomType
				+ ", roomPrice=" + roomPrice + ", roomNo=" + roomNo + "]";
	}
	
	
	

}
 