package cyclelable;

public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lun=34;
		int times=9;
		outter: for(int i=1;i<=lun;i++){
			System.out.println("���������"+i+"�ֿ�ʼ");
			inner: for(int j=1;j<=9;j++){
				if(j==3){
					continue outter;
				}
				System.out.println("��׵�"+i+"�ֵ�"+j+"����ʼ����");
				//break outter;
			}
			System.out.println("���������"+i+"�ֽ���");
		}
	}

}
