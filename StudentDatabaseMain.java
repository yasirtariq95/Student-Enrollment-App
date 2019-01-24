import java.util.*;

public class StudentDatabaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("How many students you want to enroll: ");
		int students = k.nextInt();
		
		StudentDatabase [] st = new StudentDatabase[students];
		
		for (int i = 0; i< students; i++)
		{
			st[i] = new StudentDatabase();
		}
		
		for (int i = 0; i< students; i++)
		{
			st[i].Show();
		}
		

	}

}
