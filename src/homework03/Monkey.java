package homework03;

public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬������񫣬�ֶ����һ��
		//�ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ��
		//�Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��
		//����ʮ���������ʱ�����־�ʣ����һ��
		//���һ��ժ�˶�������
		int left=1;
		int day=10;
		int total=0;
		while(day>1){
			total=(left+1)*2;
			left=total;
			day=day-1;
			System.out.println(day+", "+total);
		}
		System.out.println(total);
		
		
	}

}
