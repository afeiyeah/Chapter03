package ifdemo;

public class Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//password�����û����������
		int password=123;
		//����û���������ǡ�õ���123�������û���¼
		if(password==123){
			System.out.println("�û���¼�ɹ���");
		}
		//���������123����ʾ��������
		else{
			System.out.println("������������µ�¼");
		}
		boolean flag=false;
		if(flag){
			System.out.println("flag�洢������ֵ");
		}
		else{
			System.out.println("flag�洢���Ǽ�ֵ");
		}
		if(flag==true){
			System.out.println("flag�洢������ֵ");
		}
		else{
			System.out.println("flag�洢���Ǽ�ֵ");
		}
		//�����������������flag�д洢���߼�ֵ
		if(flag=true){
			System.out.println("flag�洢������ֵ");
		}
		else{
			System.out.println("flag�洢���Ǽ�ֵ");
		}

	}

}








