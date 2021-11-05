package empWageOops;

public class Employee implements Wage {
	 Company company;

	    Employee() {
	    };

	    Employee(Company company) {
	        this.company = company;
	    }

	    public Company getCompany() {
	        return company;
	    }

	    public void setCompany(Company company) {
	        this.company = company;
	    }

	    public int calculateWage() {
	        if (company == null) // if unemployed
	            return 0;

	        int totalWage = 0;
	        int totalHrs = 0;
	        for (int day = 0; day < company.getMaxDays() && totalHrs < company.getMaxHrs(); day++) {
	            int empHrs = 0;
	            int empWage = 0;
	            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	            switch (empCheck) {
	                case IS_FULL_TIME:
	                    empHrs = 8;
	                    break;
	                case IS_PART_TIME:
	                    empHrs = 4;
	                    break;
	                default:
	                    empHrs = 0;
	            }
	            totalHrs += empHrs;
	            empWage = empHrs * company.getWage();
	            totalWage += empWage;
	        }
	        return totalWage;
	    }
}
