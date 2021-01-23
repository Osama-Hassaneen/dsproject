package Employees;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Employee {





    public static void print(int emp_n){
        System.out.println("number: "+EmplyeeSystemDemo.emp.get(emp_n).getEmp_num());
        System.out.println("name: "+EmplyeeSystemDemo.emp.get(emp_n).getName());
        System.out.println("salary: "+EmplyeeSystemDemo.emp.get(emp_n).getSalary());
        System.out.println("department: "+EmplyeeSystemDemo.emp.get(emp_n).getDepartment());
        System.out.println("Date of Birth: "+EmplyeeSystemDemo.emp.get(emp_n).getDepartment());
    }



    public  void saveData() {

    try {
        if(!Files.exists(Paths.get("D:\\customers.txt")))
        {
      File customersFile = new File("D:\\customers.txt");
      if (customersFile.createNewFile()) {
        System.out.println("File created: " + customersFile.getName());
      } else {
        System.out.println("");
      }
        }
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
        try {
      FileWriter myWriter = new FileWriter("D:\\customers.txt");
      BufferedWriter bw = new BufferedWriter(myWriter);
      String listString = "";
        for (EmployeeList c : EmplyeeSystemDemo.emp )
        {
            listString += c;
        }
      bw.write(listString);
      bw.close();
      System.out.println("Data saved!!");
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }}}


