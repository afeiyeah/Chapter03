package ifdemo;

public class Wage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int income=3000;
		//先声明变量，但是不立即赋值。根据后续代码的运行情况延迟赋值
		double tax;
		if(income>=3000){
			tax=income*0.05;
		}
		else{
			tax=income*0.01;
		}
		double net=income-tax;
		System.out.println("某人的税前收入是"+income+", 应上税"+tax+", 税后收入是"+net);
	
	}

}









