package homework03;
import com.data.DataTool;
public class RemitMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ʾֻ��Ŀ�ѡ���������С��100Ԫ�����ΪһԪ
		//����������100Ԫ-5000Ԫ֮�䣬��1%�շ�
		//���������5000Ԫ�����Ϊ50Ԫ
		//������������о���
		int amount=DataTool.inputInt();
		double fee=0;
		if(amount<0){
			System.out.print("Invalid");
		}
		else{
			if(amount<100){
				fee=1;
			}
			else if(amount>=100&&amount<5000){
				fee=amount*0.01;
			}
			else{
				fee=50;
			}
			System.out.println(fee);
		}
		

	}

}
