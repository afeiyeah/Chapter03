package fordemo;
import com.data.DataTool;
public class GuessNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//随机产生一个10以内的正整数，用户循环输入三个整数，如果用户输入的整数包含随机数，输出“猜对了”；反之，“猜错了”
		System.out.println("随机数限定范围为10以内正整数");
		int ran=DataTool.inputRnd();
		//也可以用boolean方法做
		int count=0;
		for(int i=0;i<3;i++){
			int num=DataTool.inputInt();
			if(num==ran){
				count++;
			}
			
		}
		//System.out.println(ran);
		if(count==0){
			System.out.println("没猜到！");
		}
		else{
			System.out.println("猜对了！");
		}
		

	}

}
