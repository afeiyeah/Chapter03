package dowhile;

public class SumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		do{
			sum=sum+i;
			i++;
		}while(i<101);
		System.out.println("从1加到100的结果为"+sum);
	}

}
