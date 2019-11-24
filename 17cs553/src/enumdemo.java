import java.util.*;
public class enumdemo {
enum room{single("Single Room",20.3,20),DOUBLE("Double Room",30.2,30),deluxe("Deluxe Room",40.2,40),suite("Suite room",50.2,50);
private String status;
private double rate;
private int num;
room(String status,double rate,int num)
{
	this.status = status;
	this.rate=rate;
	this.num = num;
}
room()
{
	this.status="Default";
	this.rate = 0;
	this.num = 0;
}
String getStatus(){return status;}
int getNum() {return num;}
double getRate() {return rate;}

}
public static void main(String args[])
{
	room r[]=room.values();
	for(room i:room.values())
	{
		System.out.println(i);
	}
	room r1= room.single;
	if(r1.getNum()>=20)
		System.out.println("Single rooms are all booked.");
	else
		System.out.println("Single rooms available:"+r1.getNum());
	
	room r2 = room.valueOf("DOUBLE");
	switch(r2)
	{
	case DOUBLE:
		System.out.println(+r2.ordinal()+"\t"+ r2);
	break;
	case single:
		System.out.println(r2.getRate());
	}
}
}