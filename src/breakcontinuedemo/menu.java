package breakcontinuedemo;
import com.data.DataTool;
public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while(true){
			System.out.println("1.制造商资料管理");
			System.out.println("2.销售商品品牌管理");
			System.out.println("3.商品类别管理");
			System.out.println("4.商品详细信息管理");
			System.out.println("0.退出程序");
			int n=DataTool.inputInt();
			if(n==1){
				while(true){
					System.out.println("1.查看已有产品制造商");
					System.out.println("2.增加产品制造商");
					System.out.println("0.返回主界面");
					int m=DataTool.inputInt();
					if(m==0){
						break;
					}
				}
			}
			else if(n==0){
				System.out.println("欢迎使用本软件，再见！");
				break;
			}
		
			
		}
		

	}

}
