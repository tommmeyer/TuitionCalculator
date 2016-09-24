package tuitionCalculator;

public class TuitionCalc {
private double yearlyTuition;
private double percentIncrease;
public void TuitionCalc(){
	
}
public double TuitionCalculator(){
	double tuitionTotal=0;
	double newTuition = getYearlyTuition();
	for (int collegeYear=0;collegeYear<3; collegeYear++){
		tuitionTotal+=newTuition;
		newTuition = newTuition * getPercentIncrease();
	}
	return tuitionTotal;
}
public double getYearlyTuition(){
	return this.yearlyTuition;
}
public double getPercentIncrease(){
	return this.percentIncrease;
}
public void setYearlyTuition(double yearlyTuition){
	this.yearlyTuition = yearlyTuition;
}
public void setPercentIncrease(double percentIncrease){
	this.percentIncrease = percentIncrease;
}
}

