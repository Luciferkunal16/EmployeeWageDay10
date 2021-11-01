package Line_Conversion;

import java.util.Scanner;

public class Oops_Employee_Wage {
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static  int EMP_RATE_PER_HOUR;
public static  int NUM_OF_WORKING_DAYS;
public static  int MAX_HRS;
public   String companyName ;


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
	int totalEmpWage;
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
		System.out.println("total Emp Wage For company : "+companyName+" is "+totalEmpWage);
	
	
	
}
public static void main(String[] args) {
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter The Company Name");
	String companyName=inp.next();
	System.out.println("Enter the Employe Rate :-");
	int empRate=inp.nextInt();
	System.out.println("Enter Number of Working Days");
	int numOfWorkingDays=inp.nextInt();
	System.out.println("Enter Maximum Hours for Company");
	int maxHrs=inp.nextInt();
	Oops_Employee_Wage obj=new Oops_Employee_Wage(companyName, empRate, numOfWorkingDays, maxHrs);
	
	obj.computeWage();
	
}
}
