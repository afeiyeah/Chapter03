package fordemo;
import com.data.DataTool;
public class GuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������һ��10���ڵ����������û�ѭ��������������������û���������������������������¶��ˡ�����֮�����´��ˡ�
		System.out.println("������޶���ΧΪ10����������");
		int ran=DataTool.inputRnd();
		//Ҳ������boolean������
		int count=0;
		for(int i=0;i<3;i++){
			int num=DataTool.inputInt();
			if(num==ran){
				count++;
			}
			
		}
		//System.out.println(ran);
		if(count==0){
			System.out.println("û�µ���");
		}
		else{
			System.out.println("�¶��ˣ�");
		}
		

	}

}
