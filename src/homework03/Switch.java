package homework03;
import com.data.DataTool;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������������һ��4λ�������������ת�Ժ������
		//System.out.println("��������λ����");
		int num=DataTool.inputInt();
		int digit=0;
		int newnum=0;
		while(num!=0){
			
			newnum=num%10+newnum*10;
			num=num/10;
			digit++;
		}
		System.out.println(newnum);
	}

}
