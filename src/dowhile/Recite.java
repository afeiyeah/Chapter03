package dowhile;

public class Recite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times=0;
		do{
			//循环过程中，每次重复执行的代码要写在while花括号里
			System.out.println("Read book!");
			times++;
			System.out.println("此时times的数值是"+times);
		}
		while(times<3);
	}

}
