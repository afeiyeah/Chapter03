package homework03;

public class SumforDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ֱ�ʹ��forѭ����whileѭ����doѭ������1��100֮�������ܱ�3�����������ĺ�
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
