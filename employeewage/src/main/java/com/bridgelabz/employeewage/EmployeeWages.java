package wage.employeewage.src.main.java.com.bridgelabz.employeewage;

public class EmployeeWages {
	public static void main(String args[]) {
		double code = Math.floor(Math.random() * 10) % 2;
		if (code == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}
}
