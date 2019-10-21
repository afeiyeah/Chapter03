package homework03;

public class SumforDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//分别使用for循环，while循环，do循环，求1到100之间所有能被3整除的整数的和
		int sum=0;
		
		for(int div=0; div<=100; div++){
			int mod=div%3;
			if(mod==0){
				sum=sum+div;

			}
		}
		System.out.println(sum);

	}

}
