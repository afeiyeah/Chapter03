package homework03;
import com.data.DataTool;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求出整数n的阶乘
		int n=DataTool.inputInt();
		long f=1;
		if(n==0){
			f=0;
		}
		else{
			for(int i=1; i<=n; i++){
				f=f*i;
			}
		}
		System.out.println(f);
	}

}
