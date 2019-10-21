package switchdemo;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//如果月份month为1-12的一个月份，输出该月份的天数，如果数字不符合，输出“错误的月份”
		int month=3;
		int n;
		if(month>12||month<1){
			n=1;
		}
		else if(month==2){
			n=2;
		}
		else if(month==4||month==6||month==9||month==11){
			n=3;
		}
		else{
			n=4;
		}
		switch(n){
		case 1:
			System.out.println("错误的月份");
			break;
		case 2:
			System.out.println(month+"月的天数有28天");
			break;
		case 3:
			System.out.println(month+"月的天数有30天");
			break;
		default:
			System.out.println(month+"月的天数有31天");
			
		}
		//如果用直落现象代码更简单
		
	}

}
