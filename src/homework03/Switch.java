package homework03;
import com.data.DataTool;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//由命令行输入一个4位整数，求该数反转以后的数。
		//System.out.println("请输入四位整数");
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
