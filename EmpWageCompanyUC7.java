public class EmpWageCompanyUC7
{
	public static final int Is_Full_Time = 1;
	public static final int Is_Part_Time = 2;
	public static final int Emp_Wage_Per_Hr=20;
	public static final int Num_Of_Working_Days=20;
	public static final int Max_Working_Hrs=100;

	public static int calEmpWageForCompany(String company, int numOfDays, int empRate, int maxHrs)
	{
		int empWage = 0, totalEmpHrs=0;
		int totalEmpWage=0, totalWorkingDays=0;
		int empHrs;
		System.out.println("Employee Wages for "+company);
		while (totalEmpHrs <= Max_Working_Hrs && totalWorkingDays < Num_Of_Working_Days)
		{	
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()*10) % 3;
			switch ((int)empCheck)
			{
				case Is_Full_Time :
					empHrs=8;
					break;
				case Is_Part_Time :
					empHrs=4;
					break;
				default :
					empHrs=0;
			}
			totalEmpHrs=totalEmpHrs+empHrs;
			System.out.println("Day : " +totalWorkingDays +" Emp Hrs: " +totalEmpHrs);
		}
		totalEmpWage=totalEmpHrs*empRate;
		System.out.println("Total Employee Wage for "+company+" is: "+totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String args[]){
		calEmpWageForCompany("TCS", 20, 20, 100);
		calEmpWageForCompany("Reliance", 20, 15, 100);
	}

}	