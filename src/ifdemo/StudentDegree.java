package ifdemo;

public class StudentDegree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������x����ѧ���ɼ�
		//���x>=90,��ӡ�ɼ��ȼ�Ϊ����
		//���x>=80,��ӡ�ɼ��ȼ�Ϊ����
		//���x>=70,��ӡ�ɼ��ȼ�Ϊ�е�
		//���x>=60,��ӡ�ɼ��ȼ�Ϊ����
		//���x<60,��ӡ�ɼ��ȼ�Ϊ������
		int x=87;
		if(x>100||x<0){
			System.out.println("ѧ���ɼ������涨��Χ");
		}
		else if(x>=90){
			System.out.println("ѧ���ɼ�Ϊ����");
		}
		else if(x>=80){
			System.out.println("ѧ���ɼ�Ϊ����");
		}
		else if(x>=70){
			System.out.println("ѧ���ɼ�Ϊ�е�");
		}
		else if(x>=60){
			System.out.println("ѧ���ɼ�Ϊ����");
		}
		else{
			System.out.println("ѧ���ɼ�Ϊ������");
		}

	}

}
