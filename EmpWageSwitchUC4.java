public class EmpWageSwitchUC4{
	public static final int Is_Full_Time = 1;
	public static final int Is_Part_Time = 2;
	public static final int Emp_Wage_Per_Hr=20;

	public static void main(String args[]){
	
	int empHrs = 0;
	int empWage = 0;
	int empCheck = (int) Math.floor(Math.random()*10) % 3;
	switch ((int)empCheck) {
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
	System.out.println("Emp Wage = "+empWage);
	}
}