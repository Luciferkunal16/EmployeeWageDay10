package empWageOops;

import java.util.ArrayList;
import java.util.List;

public class Company implements Wage {
	private int empRatePerHr;
    private int workingDaysPerMonth;
    private int maxWorkingHrs;
    private List<Employee> emplist = new ArrayList<>();
    private int totalSalary = -1;

    public Company(int wage, int workingDays, int maxWorkingHrs) {
        this.empRatePerHr = wage;
        this.workingDaysPerMonth = workingDays;
        this.maxWorkingHrs = maxWorkingHrs;
    }

    public int getWage() {
        return empRatePerHr;
    }

    public int getMaxDays() {
        return workingDaysPerMonth;
    }

    public int getMaxHrs() {
        return maxWorkingHrs;
    }

    public void hire(Employee e) {
        e.setCompany(this);
        emplist.add(e);
    }

    public void fire(Employee e) {
        e.setCompany(null);
        emplist.remove(e);
    }

    // total salary expense incurred by the company
    public int calculateWage() {
        if (totalSalary != -1)
            return totalSalary;
        int totalSalary = 0;
        for (Employee e : emplist)
            totalSalary += e.calculateWage();

        return totalSalary;
    }
}
