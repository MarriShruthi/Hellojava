public class EmpWageConditionUC6{
	public static final int Is_Full_Time = 1;
	public static final int Is_Part_Time = 2;
	public static final int Emp_Wage_Per_Hr=20;
	public static final int Num_Of_Working_Days=20;
	public static final int Max_Working_Hrs=100;


	public static void main(String args[]){
	
	int empWage = 0, totalEmpHrs=0;
	int TotalWages=0, WorkingDays=0;

	while (totalEmpHrs <= Max_Working_Hrs && WorkingDays < Num_Of_Working_Days)
	{	
		int empHrs=0;
		WorkingDays++;
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
	empWage = empHrs * Emp_Wage_Per_Hr;
	totalEmpHrs=totalEmpHrs+empHrs;
	TotalWages = TotalWages+empWage;
	System.out.println("Emp Wage = "+empWage);
	}
	System.out.println("Total Employee Wage = "+TotalWages);
	}
}