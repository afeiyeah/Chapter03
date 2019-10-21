package fordemo;

public class SumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=1;i<101;i++){
			sum=sum+i;
			i++;
		}
		System.out.println("从1加到100的结果为"+sum);
	}

}
