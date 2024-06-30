package Programm9;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double hra;
    private double pf;
    private double pt;
    private double netSalary;
    private double grossSalary;
    private static int idCounter = 1;

    // Two-parameter constructor
    public Employee(String employeeName, double basicSalary) {
    	
        this.employeeId = idCounter++;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        calculateSalary();
    }

    // Method to calculate salaries
    private void calculateSalary() {
        this.hra = 0.5 * basicSalary;
        this.pf = 0.12 * basicSalary;
        this.pt = 200;
        this.grossSalary = basicSalary + hra;
        this.netSalary = grossSalary - pf - pt;
    }

    // Method to print employee details
    public void printDetails() {
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("PT: " + pt);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }


	
	public static void main()
	{
		Employee e1 = new Employee("lokesh ", 15000 );
	     e1.calculateSalary();
	     e1.printDetails();
		}

	}

 
