package homework03;

public class IncSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ĳԱ���������н��30000Ԫ����н������������6%����дһ����������Ա��10������н
		//��ͳ��δ��ʮ���������
		double sal=30000;
		double inc=0.06;
		double sum=0;
		
		for(int count=1;count<=10;count++){
			sum=sum+sal;
			sal=sal*(1+0.06);
			//System.out.println(count+"���Ĺ���Ϊ"+sal+", "+count+"��������Ϊ"+sum);
		}

		System.out.println("ʮ���н��Ϊ"+sal+"����������Ϊ"+sum);
	}

}
