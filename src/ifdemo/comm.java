package ifdemo;

public class comm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ�����ͱ���sales,�������۽��
		//���۸������۽���ȡ��ɣ�������۽����5000���ϣ���ɰ����۽���10%
		//���С�ڵ���5000,��ɰ����۽���5%����
		//������۵����۶�����
		int sales=50001;
		double comm;
		if(sales>5000){
			comm=sales*0.1;
		}
		else{
			comm=sales*0.05;
		}
		System.out.println("ĳ�˵����۶�Ϊ"+sales+", �����Ϊ"+comm);
		
	}

}
