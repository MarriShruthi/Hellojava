public class EmpWageUC1{
	public static void main(String args[]){
	double R = Math.floor(Math.random()*10) % 2;
	if(R==1)
		System.out.println("Employee is Present");
	else
		System.out.println("Employee is Absent");
	}
}