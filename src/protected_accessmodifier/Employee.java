package protected_accessmodifier;

public class Employee {

	 private long salary;
	 public Employee() {
		 salary= 1000000000000L;
	 }
	 
	 private void showSalary() {
		 System.out.println("TIen luong = "+salary);
	 }
	 
	 public static void main(String[] args) {
		 Employee emp = new Employee();
		 emp.showSalary();
	 }
}
