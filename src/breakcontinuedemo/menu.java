package breakcontinuedemo;
import com.data.DataTool;
public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while(true){
			System.out.println("1.���������Ϲ���");
			System.out.println("2.������ƷƷ�ƹ���");
			System.out.println("3.��Ʒ������");
			System.out.println("4.��Ʒ��ϸ��Ϣ����");
			System.out.println("0.�˳�����");
			int n=DataTool.inputInt();
			if(n==1){
				while(true){
					System.out.println("1.�鿴���в�Ʒ������");
					System.out.println("2.���Ӳ�Ʒ������");
					System.out.println("0.����������");
					int m=DataTool.inputInt();
					if(m==0){
						break;
					}
				}
			}
			else if(n==0){
				System.out.println("��ӭʹ�ñ�������ټ���");
				break;
			}
		
			
		}
		

	}

}
