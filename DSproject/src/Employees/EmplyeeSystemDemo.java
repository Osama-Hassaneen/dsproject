package Employees;

import static Employees.EmployeeList.binarySearch;
import static Employees.EmployeeList.insertionSort;
import static Employees.EmployeeList.linearSearch;
//mport static Employees.EmployeeList.selectionSort;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

public class EmplyeeSystemDemo {
   EmployeeList employee;
  static int num;
  static String emp_num;
  static int emp_salary;
  static String emp_department;
  static String DOB;
  static EmployeeList s1;
  static EmployeeList s3;
     public static EmployeeList Data(int a,String b,int c,String d,String f,int choice)
  {
      EmplyeeSystemDemo.num=a;
      EmplyeeSystemDemo.emp_num=b;
      EmplyeeSystemDemo.emp_salary=c;
      EmplyeeSystemDemo.emp_department=d;
      EmplyeeSystemDemo.DOB=f;
             return   s1 =new EmployeeList(num,emp_num,emp_salary,emp_department,DOB);
//                if(choice==1)
//                {
//                    emp.add(s1);
//                    
//                }
//                else
//                {
//                    emp.add(s1);
//                    emp.remove(s1);
//                    emp.remove(s1);
//                }

                     
      
  }
  static ArrayList<EmployeeList> emp = new ArrayList<EmployeeList>(1000);
 
    public static void main(String[] args) {
       int emp_no;
       String name;
       int salary ;
       String department;
       String emp_DOB ;

Employee h = new Employee();



        Scanner scan = new Scanner(System.in);

        for(;;){
          System.out.println("1. adding employee");
          System.out.println("2. employee deletion");
          System.out.println("3. employee SelectionSort");
          System.out.println("4. employee insertionSort");
          System.out.println("5. employee binarySearch");
          System.out.println("6. employee linearSearch");
          System.out.println("7. close app");
        
            int Mnum = scan.nextInt();
                if(Mnum ==1){

                    System.out.println("adding employee");

                   System.out.print("employee number: ");
                   emp_no = scan.nextInt();

                    System.out.print("employee name: ");
                    name = scan.next();

                    System.out.print("employee: salary: ");
                    salary = scan.nextInt();

                    System.out.print("employee department: ");
                    department = scan.next();
                    System.out.println("Date of Birth: ");
                    emp_DOB = scan.next();
                       
                    emp.add(Data(emp_no,name,salary,department,emp_DOB,1));
                     //Insert
                       
                     
                    
                    
                    System.out.println("added \n");
                    h.saveData();
                   
                }
                else if(Mnum ==2){
                    System.out.println("employee deletion");
                   System.out.print("employee number: ");
                    emp_no = scan.nextInt();

                    System.out.print("employee name: ");
                    name = scan.next();

                    System.out.print("employee: salary: ");
                    salary = scan.nextInt();

                    System.out.print("employee department: ");
                    department = scan.next();
                    System.out.println("Date of Birth: ");
                    emp_DOB = scan.next();
                    EmployeeList s2=Data(emp_no,name,salary,department,emp_DOB,2);
                    emp.remove(s2);
                    
                            System.out.println("Deleted");
                    h.saveData();
                }

                
                else if(Mnum ==3){
                    System.out.println("employee SelectionSort");
                   // selectionSort();
                  h.saveData();
                }
                else if(Mnum ==4){
                    System.out.println("employee insertionSort");
                    insertionSort();
                   h.saveData();
                }
                else if(Mnum ==5){
                    System.out.println("employee binarySearch");
                    System.out.print("enter the number of employee you want to search: ");
                     emp_no  = scan.nextInt();
                    binarySearch(emp_no);
                   h.saveData();
                }
                else if(Mnum ==6){
                    System.out.println("employee linearSearch");
                    System.out.print("enter the number of employee you want to search: ");
                    emp_no = scan.nextInt();
                    linearSearch(emp_no);
                   h.saveData();
                                }
                else
                    exit(0);
            }


        }
 

}

