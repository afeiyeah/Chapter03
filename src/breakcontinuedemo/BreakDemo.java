package breakcontinuedemo;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10;i++){
			if(i==5){
				//当i=5时，整个循环终止，break后面的循环语句不再执行
				break;
			}
			System.out.println(i);
		}

	}

}
