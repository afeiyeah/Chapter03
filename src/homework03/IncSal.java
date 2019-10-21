package homework03;

public class IncSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//假设某员工今年的年薪是30000元，年薪的年增长率是6%。编写一个程序计算该员工10年后的年薪
		//并统计未来十年的总收入
		double sal=30000;
		double inc=0.06;
		double sum=0;
		
		for(int count=1;count<=10;count++){
			sum=sum+sal;
			sal=sal*(1+0.06);
			//System.out.println(count+"年后的工资为"+sal+", "+count+"年总收入为"+sum);
		}

		System.out.println("十年后薪资为"+sal+"，年总收入为"+sum);
	}

}
