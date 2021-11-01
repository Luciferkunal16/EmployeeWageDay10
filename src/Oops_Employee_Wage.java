package Line_Conversion;

import java.util.Scanner;

public class Oops_Employee_Wage {
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static  int EMP_RATE_PER_HOUR;
public static  int NUM_OF_WORKING_DAYS;
public static  int MAX_HRS;
public   String companyName ;
public int totalEmpWage;


 public Oops_Employee_Wage(String company,int empRatePerHour,int numofWorkingDays,int maxHrs) {
	companyName=company;
	EMP_RATE_PER_HOUR=empRatePerHour;
	NUM_OF_WORKING_DAYS=numofWorkingDays;
	MAX_HRS=maxHrs;
}

 void computeWage() {
	int empHrs=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;
	while (totalEmpHrs <=MAX_HRS && totalWorkingDays <NUM_OF_WORKING_DAYS) {
		totalWorkingDays++;
		int attendence=(int)((Math.random()*10)%3);
		switch (attendence) {
		case IS_PART_TIME:
			empHrs=4;
			break;
		case IS_FULL_TIME:
			empHrs=8;
			break;
		default:
			empHrs=0;
			break;
			
		}
		totalEmpHrs=empHrs+totalEmpHrs;
		System.out.println("No. of Days: "+ totalWorkingDays +" Total Hours is "+empHrs);
	
	
		}
		totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
		
	
	
	
}
 public String toString() {
	 return "Total Emp Wage for Company "+companyName+" is "+totalEmpWage;
 }
public static void main(String[] args) {
	
	Oops_Employee_Wage reliance=new Oops_Employee_Wage("Reliance", 20, 30, 10);
	Oops_Employee_Wage Airtel=new Oops_Employee_Wage("Airtel", 12, 2, 8);
	reliance.computeWage();
	System.out.println(reliance.toString());
	Airtel.computeWage();
	System.out.println(Airtel);
	
	
	
	
}
}
