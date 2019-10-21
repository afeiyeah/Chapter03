package fordemo;
import com.data.DataTool;
public class TotalMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//循环得到用户从控制台输入的5个整数，该整数为用户购买的商品的价格，计算用户一共需要花费的总金额
		int sum=0;
		for(int i=0;i<5;i++){
			int num=DataTool.inputInt();
			if(num<0){
				System.out.println("Invalid！请重新输入！");
				i--;
			}
			else{
			sum=sum+num;
			}
		}
		System.out.println(sum);
	}

}
