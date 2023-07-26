package com.zieta.corejava1;

 class Employee {
    private int id;
    private String name;
    
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}

public class ReferenceDemo {
    public static void main(String[] args) {
        // Create a new Employee object
        Employee emp1 = new Employee(101, "John Doe");
        
        // Demonstrate changing the reference
        Employee emp2 = emp1;
        emp2.setName("Jane Doe");
        
        System.out.println("Employee 1 name: " + emp1.getName()); // Output: Employee 1 name: Jane Doe
        
        // Demonstrate returning reference
        Employee emp3 = getEmployee();
        emp3.setName("Bob Smith");
      
        System.out.println("Employee 3 name: " + emp3.getName()); // Output: Employee 3 name: Bob Smith
        
        // Demonstrate passing reference as argument to method
        changeEmployeeName(emp1);
        System.out.println("Employee 1 name: " + emp1.getName()); // Output: Employee 1 name: Alice Smith
    }
    
    public static Employee getEmployee() {
        Employee emp = new Employee(102, "Mary Smith");
        return emp;
    }
    
    public static void changeEmployeeName(Employee emp) {
        emp.setName("Alice Smith");
    }
}
