package ifdemo;

public class StudentDegree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个变量x代表学生成绩
		//如果x>=90,打印成绩等级为优秀
		//如果x>=80,打印成绩等级为良好
		//如果x>=70,打印成绩等级为中等
		//如果x>=60,打印成绩等级为及格
		//如果x<60,打印成绩等级为不及格
		int x=87;
		if(x>100||x<0){
			System.out.println("学生成绩超出规定范围");
		}
		else if(x>=90){
			System.out.println("学生成绩为优秀");
		}
		else if(x>=80){
			System.out.println("学生成绩为良好");
		}
		else if(x>=70){
			System.out.println("学生成绩为中等");
		}
		else if(x>=60){
			System.out.println("学生成绩为及格");
		}
		else{
			System.out.println("学生成绩为不及格");
		}

	}

}
