package lab;

public class Employee {
   private String name;
   private int empId;
   private double salary;
   public Employee() {
	   //TODO
   }
   //Parameterized constructor
   public Employee(String name, int empId, double salary) {
	   this.name = name;
	   this.empId = empId;
	   this.salary = salary;
   }
   //Getter method
   public String getName() {
	   return name;
   }
   public int getEmpId() {
	   return empId;
   }
   public double getSalary() {
	   return salary;
   }
   //Setter method
   public void setName(String name) {
	   this.name = name;
   }
   public void setEmpId(int empId) {
	   this.empId = empId;
   }
   public void setSalary(double salary) {
	   this.salary = salary;
   }
   @Override
   public boolean equals(Object obj) {
	   if(obj == null)
		   return false;
	   if(this == obj)
		   return true;
	   if(!(obj instanceof Employee))
		   return false;
	   Employee other = (Employee) obj; //downcasting
	   if(this.empId == other.empId)
		   return true;
	   return false;
		   
   }
   @Override
   public String toString() {
		return "Employee [Name=" + name + ", EmpId=" + empId + ", Salary=" + salary+ "]";
		}
		
   
   
 }
