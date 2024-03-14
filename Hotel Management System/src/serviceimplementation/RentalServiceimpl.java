package serviceimplementation;

import java.util.LinkedHashMap;
import java.util.Scanner;

import entity.Address;
import entity.Customer;
import service.RentalService;

public class RentalServiceimpl implements RentalService 
{
	Scanner ip = new Scanner(System.in);
	{
	for(int i=101;i<=108;i++) {
		nan.put(i,null);
	}
	for(int i=201;i<=205;i++) {
		ac.put(i,null);
	}
	for(int i=301;i<=303;i++) {
		deluxe.put(i,null);
	}
	}
	@Override
	public void info() {
		System.out.println("=======Non-AC=======");
		System.out.println("Non-AC");
		System.out.println("Wifi");
		System.out.println("Tv");
		System.out.println("2 Members");
		System.out.println("Price:2000");
		System.out.println("==========Ac=======");
		System.out.println("AC");
		System.out.println("Wifi");
		System.out.println("Tv");
		System.out.println("2 Members");
		System.out.println("Price:2500");
		System.out.println("==========Deluxe=======");
		System.out.println("AC");
		System.out.println("Wifi");
		System.out.println("Tv");
		System.out.println("Fridge");
		System.out.println("3 to 4 Members");
		System.out.println("Price:3000");

		
		
	}
	void checkRooms(LinkedHashMap<Integer,Customer>m,String type) {
		System.out.println("======="+type+"Rooms:=======");
		int c=0;
		for(Integer roomno:m.keySet()) {
			if(m.get(roomno)==null) {
				System.out.println(roomno+" ");
				c++;
			}
		}
		System.out.println();
		if(c==0) {
			System.out.println("No Rooms Avialable...!!!");
		}
	}

	@Override
	public void roomsAvailable() {checkRooms(nan,"Non-AC");
	checkRooms(ac,"AC");
	checkRooms(deluxe,"Deluxe");
		
		
	}
	public void allocate(LinkedHashMap<Integer,Customer>m,String roomType,double roomPrice) 
	{
		System.out.println("Enter the Roomno:");
		int roomno=ip.nextInt();
		if(m.containsKey(roomno)&& m.get(roomno)==null) {
			System.out.println("Enter Customer ID:-");
			int cid=ip.nextInt();
			System.out.println("Enter Customer Name:-");
			String cname=ip.next();
			System.out.println("Enter Customer Phno:-");
			long cphno=ip.nextLong();
			System.out.println("Enter Customer House No:-");
			String houseNo=ip.next();
			System.out.println("Enter Street Name:-");
			String Sname=ip.next();
			System.out.println("Enter Pincode:-");
			int pcd=ip.nextInt();
			Customer c = new Customer(cid,cname,cphno, new Address(houseNo,Sname,pcd),roomType,roomPrice,roomno);
			m.put(roomno, c);
			l1.add(c);
			System.out.println(c.getCname()+"had been allocate for "+roomType+"roomno:"+roomno);
			System.out.println(c.getCname()+"need to pay Rs."+roomPrice);
		}
		else
		{
			System.out.println("Invalid Roomno:------");
		}
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("======Chech-IN=======");
		System.out.println("1.Non AC\n2.AC\n3.Deluxe");
		System.out.println("Enter the Option");
		int op=ip.nextInt();
		switch(op) {
		case 1:allocate(nan,"Non AC",2000);break;
		case 2:allocate(ac,"Ac",2500);break;
		case 3:allocate(deluxe,"Deluxe",3000);break;
		default:System.out.println("Invalid Option:-");
		}
	}
	void deAllocate(LinkedHashMap<Integer,Customer>m) {
		System.out.println("Enter the roomno:-");
		int roomno=ip.nextInt();
		if(m.containsKey(roomno)&& m.get(roomno)!=null) {
			Customer c=m.get(roomno);
			System.out.println(c.getCname()+"Thanks For Visiting Our Hotel...!!!");
			m.put(roomno, null);
		}
		else {
			System.out.println("Invalid RoomNo...!!!!");
		}
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("===========Check-Out=========");
		System.out.println("1.Non AC\n2.AC\n3.Deluxe");
		System.out.println("Enter The Option");
		int op=ip.nextInt();
		switch(op) {
		case 1:deAllocate(nan);break;
		case 2:deAllocate(ac);break;
		case 3:deAllocate(deluxe);break;
		default: System.out.println("Invalid Option:-");
		}
		
	}
	
	@Override
	public void customerDetail() {
		// TODO Auto-generated method stub
		int c=0;
		System.out.println("===========Customer Details=======");
		for(Customer ele:l1) {
			System.out.println(ele);
			c++;
		}
		if(c==0) {
			System.out.println("No Customer Data Found");
		}
	}

		
	}
	