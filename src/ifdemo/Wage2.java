package ifdemo;

public class Wage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//С��3000һ����>=3000��<4000һ����>=4000����<5000һ����>=5000һ��
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
		System.out.println("ĳ�˵�˰ǰ����Ϊ"+income+", ����˰"+tax+", ˰������Ϊ"+net);

	}

}
