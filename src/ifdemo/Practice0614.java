package ifdemo;

public class Practice0614 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//练习1
		//假设有整型变量x，判断x是否为偶数，若为偶数，则在控制台上打印“输入的数值为偶数”
		//无论x是否为偶数，最后都要在控制台上输出x的值
		int x=997;
		double remainder;
		remainder=x%2;
		if(remainder==0){
			System.out.println("输入的数值为偶数");
		}
		System.out.println(x);
		//练习2
		//有一个数字为45327，判断该数字是否能被13整除，是否能被17整除
		int a=45327;
		int b=13;
		int c=17;
		int remainder_ab=a%b;
		int remainder_ac=a%c;
		if(remainder_ab==0){
			System.out.println("数字45327可以被13整除");
		}
		else{
			System.out.println("数字45327不能被13整除");
		}
		if(remainder_ac==0){
			System.out.println("数字45327可以被17整除");
		}
		else{
			System.out.println("数字45327不能被17整除");
		}
		
		//练习3
		//有整型变量x，y。请输出x，y中比较大的一个
		int xc=5;
		int yc=6;
		int zc=xc-yc;
		if(zc>0){
			System.out.println(xc);
		}
		else if(zc<0){
			System.out.println(yc);
		}
		else{
			System.out.println(xc+""+yc);
		}
		
		
	}

}
