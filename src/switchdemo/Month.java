package switchdemo;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����·�monthΪ1-12��һ���·ݣ�������·ݵ�������������ֲ����ϣ������������·ݡ�
		int month=3;
		int n;
		if(month>12||month<1){
			n=1;
		}
		else if(month==2){
			n=2;
		}
		else if(month==4||month==6||month==9||month==11){
			n=3;
		}
		else{
			n=4;
		}
		switch(n){
		case 1:
			System.out.println("������·�");
			break;
		case 2:
			System.out.println(month+"�µ�������28��");
			break;
		case 3:
			System.out.println(month+"�µ�������30��");
			break;
		default:
			System.out.println(month+"�µ�������31��");
			
		}
		//�����ֱ������������
		
	}

}
