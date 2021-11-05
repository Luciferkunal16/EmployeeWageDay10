package empWageOops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import Line_Conversion.EmpWageOfCompany;

public class EmpWageBuilder {
	private static List<Employee> employees = new ArrayList<>();
    private static List<Company> companies = new ArrayList<>();

    public static void newEmployee(Employee e, Company parent) {
        parent.hire(e);
        e.setCompany(parent);
        employees.add(e);
    }

    public static void newCompany(Company company) {
        companies.add(company);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program");

        Company capg = new Company(20, 20, 100);
        newCompany(capg);
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        newEmployee(e1, capg);
        newEmployee(e2, capg);
        newEmployee(e3, capg);
        System.out.println("Total emp Wage for capg: " + capg.calculateWage());
        
        Company infy = new Company(18, 20, 160);
        newCompany(infy);
        Employee e4 = new Employee();
        Employee e5 = new Employee();
        newEmployee(e4, infy);
        newEmployee(e5, infy);
        System.out.println("Total emp Wage for infy: " + infy.calculateWage());
    }


}

