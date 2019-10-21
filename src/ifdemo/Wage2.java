package ifdemo;

public class Wage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//小于3000一档，>=3000但<4000一档，>=4000但是<5000一档，>=5000一档
		int income=3000;
		double tax;
		if(income<3000){
			tax=0;
		}
		else if(income<4000){
			tax=income*0.01;
		}
		else if(income<5000){
			tax=income*0.02;
		}
		else{
			tax=income*0.04;
		}
		double net=income-tax;
		System.out.println("某人的税前收入为"+income+", 需纳税"+tax+", 税后收入为"+net);

	}

}
