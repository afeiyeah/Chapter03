package breakcontinuedemo;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10;i++){
			if(i==5){
				//当i=5时，此轮循环结束，跳过当前这一轮，进行下一轮循环
				continue;
			}
			System.out.println(i);
		}

	}

}
