package fordemo;
import com.data.DataTool;
public class TotalMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ѭ���õ��û��ӿ���̨�����5��������������Ϊ�û��������Ʒ�ļ۸񣬼����û�һ����Ҫ���ѵ��ܽ��
		int sum=0;
		for(int i=0;i<5;i++){
			int num=DataTool.inputInt();
			if(num<0){
				System.out.println("Invalid�����������룡");
				i--;
			}
			else{
			sum=sum+num;
			}
		}
		System.out.println(sum);
	}

}
