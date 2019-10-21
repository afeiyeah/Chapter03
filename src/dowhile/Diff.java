package dowhile;

public class Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times=3;
		while(times<3){
			System.out.println("在while循环里每天读书");
			times++;
		}
		do{
			System.out.println("在dowhile循环里每天读书");
			times++;
		}while(times<3);

	}

}
