package switchdemo;
import com.data.DataTool;
public class Sys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pow = DataTool.inputInt();
		switch(pow){
		//���default��ǰ�ã�Ҳ��Ҫд��break����ǰ�õĻ�������Ҫ��
		case 1:
			System.out.println("��ͨ�û�");
			//break����������ֱֹ��������
			break;
		case 2:
			System.out.println("��������Ա");
			break;
		case 3:
			System.out.println("��������Ա");
			break;
		default: 
			System.out.println("�����Ȩ��ֵ����");
		}
	}

}
