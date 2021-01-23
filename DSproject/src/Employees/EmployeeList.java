package Employees;

import java.util.ArrayList;


public class EmployeeList {

  private int emp_no;
  private String name;
  private int salary;
  private String department;
  private String DOB;
  int i;



public void EmployeeList()
{
    
}
 public static void Data(int a,String b,int c,String d,String f)
  {
      EmplyeeSystemDemo.num=a;
      EmplyeeSystemDemo.emp_num=b;
      EmplyeeSystemDemo.emp_salary=c;
      EmplyeeSystemDemo.emp_department=d;
      EmplyeeSystemDemo.DOB=f;
               
              
      
  }

    public EmployeeList(int emp_no,String name,int salary,String department,String DOB)
    {
       this.emp_no=emp_no;
       this.name=name;
       this.salary=salary;
       this.department=department;
       this.DOB=DOB;
    }
                  

    public int getEmp_num() {
        return emp_no;
    }


    public String getName() {
        return name;
    }


    public int getSalary() {
        return salary;
    }


    public String getDepartment() {
        return department;
    }

    public String getDOB()
    {
      return DOB;
    }


//
//    public static void selectionSort() {
//         for (int i = 0; i < emp.size(); i++) {
//
//            int pos = i;
//            for (int j = i; j < emp.size(); j++) {
//                if (emp.get(j).getEmp_num() < emp.get(pos).getEmp_num())
//                    pos = j;
//            }
//
//            emp.get(pos);
//            emp.set(pos, emp.get(i));
//            emp.set(i, min);
//        }
//        for (int i = 0; i < emp.size(); i++) {
//        new Employee().print(i+1);
//    }
//    }*/



    public static void insertionSort() {
    int i,j;

    for (i = 1; i < EmplyeeSystemDemo.emp.size(); i++) {

        j = i;
        while((j > 0) && (EmplyeeSystemDemo.emp.get(j).getEmp_num() >  EmplyeeSystemDemo.emp.get(i).getEmp_num())) {
            EmplyeeSystemDemo.emp.set(j,EmplyeeSystemDemo.emp.get(j ));
            j--;
        }
       EmplyeeSystemDemo.emp.set(j,EmplyeeSystemDemo.emp.get(j));
    }
    for (i = 0; i < EmplyeeSystemDemo.emp.size(); i++) {
        new Employee().print(i);
    }

}

    public static void binarySearch(int x) {
        int l = 0, r = EmplyeeSystemDemo.emp.size() ;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (EmplyeeSystemDemo.emp.get(m).getEmp_num() == x){
                new Employee().print(m);
                break;
                
            }

            if (EmplyeeSystemDemo.emp.get(m).getEmp_num() < x)
                l = m + 1;

            else
                r = m - 1;
        }

  
    }
    public static void linearSearch(int x) {
    int n = EmplyeeSystemDemo.emp.size();
    for(int i = 0; i < n; i++)
    {
        if(EmplyeeSystemDemo.emp.get(i).getEmp_num() == x)
            new Employee().print(i+1);
            break;
            
    }
}




public String toString()
{
  return "Employee[id=" + emp_no + ",Name=" + name + ",Salary=" + salary + ",Department=" + department + ",Date of Birth="+DOB+"]";
}
}
