package switchdemo;
import com.data.DataTool;
public class Sys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pow = DataTool.inputInt();
		switch(pow){
		//如果default被前置，也需要写上break，不前置的话，不需要加
		case 1:
			System.out.println("普通用户");
			//break作用在于阻止直落现象发生
			break;
		case 2:
			System.out.println("二级管理员");
			break;
		case 3:
			System.out.println("超级管理员");
			break;
		default: 
			System.out.println("输入的权限值错误");
		}
	}

}
