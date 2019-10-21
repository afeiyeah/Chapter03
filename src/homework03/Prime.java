package homework03;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//找出大于200的最小质数
		int num=15;
		for(int i=3; i<num; i=i+2){
			if(num%i==0){
				num=num+2;
				continue;
			}
		}
		System.out.println(num);

	}

}
