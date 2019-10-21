package ifdemo;

public class comm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明一个整型变量sales,代表销售金额
		//销售根据销售金额获取提成，如果销售金额在5000以上，提成按销售金额的10%
		//如果小于等于5000,提成按销售金额的5%计算
		//输出销售的销售额和提成
		int sales=50001;
		double comm;
		if(sales>5000){
			comm=sales*0.1;
		}
		else{
			comm=sales*0.05;
		}
		System.out.println("某人的销售额为"+sales+", 其提成为"+comm);
		
	}

}
