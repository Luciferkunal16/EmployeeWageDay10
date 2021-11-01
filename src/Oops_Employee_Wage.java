package Line_Conversion;

import java.util.Scanner;

public class Oops_Employee_Wage {
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
int numOfCompany=0;
private EmpWageOfCompany[] companyWageArray;
public  Oops_Employee_Wage(){
	companyWageArray=new EmpWageOfCompany[5];
}


void addCompanyEmpWage(String company, int empRatePerHour,int numOfWorkingDays, int maxHRs) {
	companyWageArray[numOfCompany]=new EmpWageOfCompany(company, empRatePerHour, numOfWorkingDays, maxHRs);
	numOfCompany++;
	
}
void computeEmpWage() {
	for (int i=0;i<numOfCompany;i++) {
		companyWageArray[i].setTotalEmpWage(computeWage(companyWageArray[i]));
	}
}




 int computeWage(EmpWageOfCompany companyempwage) {
	int empHrs=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;
	while (totalEmpHrs <=companyempwage.MAX_HRS&& totalWorkingDays <companyempwage.NUM_OF_WORKING_DAYS) {
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
		return totalEmpHrs*companyempwage.EMP_RATE_PER_HOUR;
		
	
	
	
}

public static void main(String[] args) {
	
	Oops_Employee_Wage empWageObj=new Oops_Employee_Wage();
	empWageObj.addCompanyEmpWage("Reliance", 20, 6, 12);
	empWageObj.addCompanyEmpWage("Airtel", 10, 2, 2);
	empWageObj.computeEmpWage();

	
	
	
}
}
