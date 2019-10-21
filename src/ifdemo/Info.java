package ifdemo;

public class Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//password代表用户输入的密码
		int password=123;
		//如果用户输入密码恰好等于123，允许用户登录
		if(password==123){
			System.out.println("用户登录成功！");
		}
		//如果不等于123，提示重新输入
		else{
			System.out.println("密码错误，请重新登录");
		}
		boolean flag=false;
		if(flag){
			System.out.println("flag存储的是真值");
		}
		else{
			System.out.println("flag存储的是假值");
		}
		if(flag==true){
			System.out.println("flag存储的是真值");
		}
		else{
			System.out.println("flag存储的是假值");
		}
		//下面这种做法变更了flag中存储的逻辑值
		if(flag=true){
			System.out.println("flag存储的是真值");
		}
		else{
			System.out.println("flag存储的是假值");
		}

	}

}








