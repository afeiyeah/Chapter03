package whiledemo;

public class ExeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个变量代表完成题目的数量，要求学生每天做20道题，未完成20题的需要继续做题
		//达到20题的时候，打印输出“奖励一朵小红花”
		int count=0;
		while(count<20){
			count++;
			System.out.println("已经完成"+count+"道题目");
		}
		System.out.println("奖励一朵小红花");
	}

}
