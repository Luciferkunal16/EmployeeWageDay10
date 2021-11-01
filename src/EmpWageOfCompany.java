package Line_Conversion;

public class EmpWageOfCompany {
	
	public static  int EMP_RATE_PER_HOUR;
	public static  int NUM_OF_WORKING_DAYS;
	public static  int MAX_HRS;
	public   String companyName ;
	public int toatalEmpWage;
	
	
	public EmpWageOfCompany(String company,int empRatePerHour,int numofWorkingDays,int maxHrs){
		companyName=company;
		EMP_RATE_PER_HOUR=empRatePerHour;
		NUM_OF_WORKING_DAYS=numofWorkingDays;
		MAX_HRS=maxHrs;
		
		
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.toatalEmpWage=totalEmpWage;
		
	}
	
	public String toString() {
		return "Total Emp Wage of company : "+companyName+" is "+toatalEmpWage;
	}

}
