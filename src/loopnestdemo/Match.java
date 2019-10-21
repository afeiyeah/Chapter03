package loopnestdemo;

public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lun=34;
		int times=9;
		for(int i=1;i<=lun;i++){
			System.out.println("意甲联赛第"+i+"轮开始");
			for(int j=1;j<=9;j++){
				System.out.println("意甲第"+i+"轮第"+j+"场开始比赛");
			}
			System.out.println("意甲联赛第"+i+"轮结束");
		}
	}

}
