package dowhile;

public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��1-100���������ĺ�
		int sum=0;
		int i=1;
		do{
			sum=sum+i;
			i=i+2;
		}while(i<100);
		System.out.println(sum);
	}

}
