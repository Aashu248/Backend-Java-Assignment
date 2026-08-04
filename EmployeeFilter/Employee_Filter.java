package EmployeeFilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.sort;

public class Employee_Filter {
    Employee_Filter()   {

    }

    static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(12, "Mishaan", 28500, "CSE"));
        emp.add(new Employee(13, "Aashmi", 30500, "CSE"));
        emp.add(new Employee(14, "Pikachu", 35500, "ECE"));
        emp.add(new Employee(15, "Nandhu", 32000, "ECE"));
        emp.add(new Employee(16, "Maari", 28000, "Mech"));
        emp.add(new Employee(17, "Guru", 31500, "CSE"));
        emp.add(new Employee(18, "Hepzi", 29000, "Bio"));
        emp.add(new Employee(19, "Hari", 31500, "Mech"));
        emp.add(new Employee(20, "Karishma", 27500, "Bio"));
        emp.add(new Employee(21, "Aravind", 28500, "ECE"));

        //printing employees with salary>30000
        System.out.println("\nEMPLOYEE WITH SALARY>30000\n");
        for(Employee e:emp) {
            if(e.salary>30000)  {
                System.out.println(e.id+"  "+e.name+"   "+e.salary+"   "+e.dept);
            }
        }

        //groupingbydepartment
        System.out.println("GROUPING EMPLOYEES DEPARTMENTWISE");
        String []dep={"CSE","ECE","Mech","Bio"};
        for(String i:dep) {
            System.out.println("\n"+i+"\n");
            for (Employee e : emp) {
                if (e.dept.equals(i)) {
                    System.out.println(e.id + "  " + e.name+"  "+e.dept);
                }
            }
        }

        //sorting
        System.out.println("\nEMPLOYEES SORTED BY NAME");
        Collections.sort(emp, Comparator.comparing(e->e.name));
        for (Employee e : emp) {
            System.out.println(e.name);
        }

    }

}
