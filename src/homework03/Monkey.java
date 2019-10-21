package homework03;

public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个
		//第二天早上又将剩下的桃子吃掉一半，又多吃了一个
		//以后每天早上都吃了前一天剩下的一半零一个
		//到第十天早上想吃时，发现就剩下了一个
		//求第一天摘了多少桃子
		int left=1;
		int day=10;
		int total=0;
		while(day>1){
			total=(left+1)*2;
			left=total;
			day=day-1;
			System.out.println(day+", "+total);
		}
		System.out.println(total);
		
		
	}

}
