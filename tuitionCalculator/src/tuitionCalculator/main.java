package tuitionCalculator;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the tuition at your school?");
		double yearlyTuition = input.nextDouble();
		byte x = 0;
		while (x==0){
			if (yearlyTuition >= 0){
				x++;
			}
			else{
				System.out.print("Invalid value. Enter valid tuition value:  ");
				yearlyTuition = input.nextDouble();
			}
		}
		System.out.println("What is the yearly tuition increase rate? 1 corresponds to 1%");
		double percentIncrease = (input.nextDouble()/100);
		TuitionCalc jawn = new TuitionCalc();
		jawn.setYearlyTuition(yearlyTuition);
		jawn.setPercentIncrease(percentIncrease);
		double money = jawn.TuitionCalculator();
		System.out.println(money);
	}

}
