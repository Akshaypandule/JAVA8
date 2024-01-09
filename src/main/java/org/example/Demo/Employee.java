package org.example.Demo;

public class Employee {

    private Integer empId;
    private String name;
    private double salary;
	

	// fix Bug -122
	
	// Logic 

	// Fix the bug 121
	// logic

    public Employee(Integer empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public int hashCode(){
        return empId;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee otherEmployee = (Employee) obj;

        // Compare the fields for equality
        return this.empId == otherEmployee.empId;
    }

}
