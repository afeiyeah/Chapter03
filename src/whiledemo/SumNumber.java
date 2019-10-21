package whiledemo;
//import com.data.DataTool;
public class SumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		while(i<101){
			sum=sum+i;
			i++;
		}
		System.out.println("从1加到100的结果为"+sum);
		//int o=DataTool.inputRnd();
		//System.out.println(o);
	}

}
