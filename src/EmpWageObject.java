package Line_Conversion;

public class EmpWageObject {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static  int EMP_RATE_PER_HOUR;
	public static  int NUM_OF_WORKING_DAYS;
	public static  int MAX_HRS;
	public   String companyName ;
	
	
	public EmpWageObject(String company,int empRatePerHour,int numofWorkingDays,int maxHrs){
		this.companyName=company;
		EMP_RATE_PER_HOUR=empRatePerHour;
		NUM_OF_WORKING_DAYS=numofWorkingDays;
		MAX_HRS=maxHrs;
		
		
	}

}
