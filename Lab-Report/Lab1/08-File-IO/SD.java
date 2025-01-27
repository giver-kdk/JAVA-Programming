// Serialization and Deserialization in JAVA

import java.io.Serializable;
import java.io.*;

class Employee implements Serializable {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Override toString method to display the object nicely
    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }
}
public class SD {
    public static void main(String[] args) {
        // Create a single Employee object
        Employee employee = new Employee("Alice", 101, 50000);

        // Write the Employee object to a file named "emp.doc"
        try (FileOutputStream fileOutputStream = new FileOutputStream("emp.doc");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(employee); // Write a single employee object to the file
            objectOutputStream.writeObject(employee); // Write a single employee object to the file
            objectOutputStream.writeObject(employee); // Write a single employee object to the file
            System.out.println("Employee object has been written to emp.doc");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the Employee object from the file
        try (FileInputStream fileInputStream = new FileInputStream("emp.doc");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            // Employee readEmployee = (Employee) objectInputStream.readObject(); // Read the employee object

			 while (true) {
                try {
                    Employee readEmployee = (Employee) objectInputStream.readObject(); // Read the employee object
                    System.out.println("\nEmployee object read from emp.doc:");
                    System.out.println(readEmployee); // Print the read employee object
                } catch (EOFException e) {
                    // End of file reached, exit the loop
                    break;
                }
            }
            System.out.println("\nEmployee object read from emp.doc:");
            // System.out.println(readEmployee); // Print the read employee object
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}