public class Employee {
    private String employeeName;
    private double basicSalary;
    private double salaryCoefficient;
    public double SALARY_MAX;

    public Employee(String employeeName, double basicSalary, double salaryCoefficient) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.salaryCoefficient = salaryCoefficient;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }

    public double getSalaryCoefficient() {
        return this.salaryCoefficient;
    }

    public double calculateSalary() {
        return basicSalary * salaryCoefficient;
    }

    public void printInformation() {
        System.out.println("Name:" + employeeName + " - " + "Basic salary: " + basicSalary + " - " + "Salary coefficient: " + salaryCoefficient);
    }

    public boolean increasingSalary(double a) {
        salaryCoefficient += a;
        if(calculateSalary() > SALARY_MAX) {
            System.out.println("exceed the max salary");
            salaryCoefficient -= a;
            return false;
        } else {
            return true;
        }
    }

}

class TestEmployee {
    public static void main(String[] args) {
        Employee a1 = new Employee("vidu",12000, 13);
        Employee a2 = new Employee("vdung", 14000, 18);
        a1.printInformation();
        a2.printInformation();
    }
}
