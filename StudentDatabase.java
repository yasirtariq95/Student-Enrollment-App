import java.util.*;

public class StudentDatabase {
	
	private String fname;
	private String lname;
	private String level;
	private int year;
	private String stid;
	private String courses = "";
	private int balance = 0;
	private int costOfCourse = 600;
	private static int ID = 6024;
	public int payment;
	
	public StudentDatabase() {
		Scanner k = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		this.fname = k.nextLine();
		
		System.out.print("Enter your last name: ");
		this.lname = k.nextLine();
		
		System.out.println("Choose your college year from the following: " + 
		                  "\n1: Freshman\n2: Sophomore\n3: Junior\n4: Senior");
		
		this.year = k.nextInt();
		
		
		
		if (year == 1)
			level = "freshman";
		else if (year == 2)
			level = "sophomore";
		else if (year == 3)
			level = "junior";
		else
			level = "senior";
		
		setID();
		
		setCourses();
		
		pay();
	}
	
	private void setID(){
		
		ID++;
		this.stid = year + "" + ID;
		
	}
	
	private void setCourses() {
		
		for (int i = 1; i> 0; i++) {
			
			System.out.println("Enter course to enroll: ");
			Scanner k = new Scanner(System.in);
			String c = k.nextLine();
			
			if (c.equals("Q") || c.equals("q"))
				break;
			
			if (c != "Q") {
				
				courses = courses + "\n" + c;
				balance = balance + costOfCourse;
			}
		}
		
		System.out.println("Your tuition balance is: " + balance);
	}
	
	private void viewBalance() {
		if (balance == 0)
			System.out.println("Congrats! You have paid your whole tuition");
		else
			System.out.println("Your remaining balance is: " + balance);
		
	}
	
	private void pay() {
		
		Scanner k = new Scanner(System.in);
		System.out.print("How much do you want to pay: ");
		payment = k.nextInt();
		System.out.println("You paid: " + payment);
		balance =  balance - payment;
		viewBalance();
		
	}
	
	public void Show() {
		
		System.out.println(fname + " " + lname + " is a " + level +
				           "\nStudent ID: " + stid +
				           "\nEnrolled in: " + courses +
				           "\nTuition Balance: " + balance);
	}

}
