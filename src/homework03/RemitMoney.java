package homework03;
import com.data.DataTool;
public class RemitMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//计算邮局汇款的款费。如果汇款金额小于100元，汇费为一元
		//如果汇款金额在100元-5000元之间，按1%收费
		//如果金额大于5000元，汇费为50元
		//汇款金额由命令行决定
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
