package ifdemo;

public class Practice0614 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ϰ1
		//���������ͱ���x���ж�x�Ƿ�Ϊż������Ϊż�������ڿ���̨�ϴ�ӡ���������ֵΪż����
		//����x�Ƿ�Ϊż�������Ҫ�ڿ���̨�����x��ֵ
		int x=997;
		double remainder;
		remainder=x%2;
		if(remainder==0){
			System.out.println("�������ֵΪż��");
		}
		System.out.println(x);
		//��ϰ2
		//��һ������Ϊ45327���жϸ������Ƿ��ܱ�13�������Ƿ��ܱ�17����
		int a=45327;
		int b=13;
		int c=17;
		int remainder_ab=a%b;
		int remainder_ac=a%c;
		if(remainder_ab==0){
			System.out.println("����45327���Ա�13����");
		}
		else{
			System.out.println("����45327���ܱ�13����");
		}
		if(remainder_ac==0){
			System.out.println("����45327���Ա�17����");
		}
		else{
			System.out.println("����45327���ܱ�17����");
		}
		
		//��ϰ3
		//�����ͱ���x��y�������x��y�бȽϴ��һ��
		int xc=5;
		int yc=6;
		int zc=xc-yc;
		if(zc>0){
			System.out.println(xc);
		}
		else if(zc<0){
			System.out.println(yc);
		}
		else{
			System.out.println(xc+""+yc);
		}
		
		
	}

}
