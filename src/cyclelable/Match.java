package cyclelable;

public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lun=34;
		int times=9;
		outter: for(int i=1;i<=lun;i++){
			System.out.println("意甲联赛第"+i+"轮开始");
			inner: for(int j=1;j<=9;j++){
				if(j==3){
					continue outter;
				}
				System.out.println("意甲第"+i+"轮第"+j+"场开始比赛");
				//break outter;
			}
			System.out.println("意甲联赛第"+i+"轮结束");
		}
	}

}
