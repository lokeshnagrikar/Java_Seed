package Day2_1;



public class Employee {
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double hra;
    private double medical;
    private double pf;
    private double pt;
    private double netSalary;
    private double grossSalary;

    // No arguments constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        calculateHRA();
        calculatePF();
        calculateGrossSalary();
        calculateNetSalary();
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getHRA() {
        return hra;
    }

    public void setHRA(double hra) {
        this.hra = hra;
    }

    public double getMedical() {
        return medical;
    }

    public void setMedical(double medical) {
        this.medical = medical;
    }

    public double getPF() {
        return pf;
    }

    public void setPF(double pf) {
        this.pf = pf;
    }

    public double getPT() {
        return pt;
    }

    public void setPT(double pt) {
        this.pt = pt;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    // Calculate HRA
    private void calculateHRA() {
        hra = 0.5 * basicSalary;
    }

    // Calculate PF
    private void calculatePF() {
        pf = 0.12 * basicSalary;
    }

    // Calculate Gross Salary
    private void calculateGrossSalary() {
        grossSalary = basicSalary + hra + medical;
    }

    // Calculate Net Salary
    private void calculateNetSalary() {
        netSalary = grossSalary - (pt + pf);
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("Medical: " + medical);
        System.out.println("PF: " + pf);
        System.out.println("PT: " + pt);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "John ", 50000);
        Employee employee2 = new Employee(2, " Doe", 80000);
        employee.displayEmployeeDetails();
        employee2.displayEmployeeDetails();
    }
}