package app;

import java.util.Scanner;

import service.RentalService;
import serviceimplementation.RentalServiceimpl;


public class RentalApp 
{
	public static void main(String[] args) 
	{
		System.out.println("======Welcome Room Rental Application=====");
		RentalService r1=new RentalServiceimpl();
		Scanner ip = new Scanner(System.in);
		while(true) {
			System.out.println("=========Menu=======");
			System.out.println("1.Info\n2.RoomAvialable\n3.Check-In\n4Check-Out\n5.Customer Details\n6..Exit");
			System.out.println("Enter The Option");
			int op=ip.nextInt();
			switch(op) {
			case 1 : r1.info();; break;
			case 2 : r1.roomsAvailable();break;
			case 3 : r1.checkIn();break;
			case 4 : r1.checkOut();break;
			case 5 : r1.customerDetail();break;
			case 6 : System.out.println("=====Thank You Visit Again===="); 
			System.exit(0);
			default : System.out.println("Invalid Option:-");
			}
		}
	}

}
