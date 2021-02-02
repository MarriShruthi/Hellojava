public class EmpWageUC3{
	public static void main(String args[]){
	double R = Math.floor(Math.random()*10) % 2;
	int Emp_Wage_Per_Hr=20;
	int empHrs = 0;
	int empWage =0;
	if(R==1)
		System.out.println("employee is full time");
	else
		empHrs=8;
		empWage = empHrs * Emp_Wage_Per_Hr;
		System.out.println("Emp Wage = "+empWage);
	}
}