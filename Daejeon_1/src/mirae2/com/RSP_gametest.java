package mirae2.com;

public class RSP_gametest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RSP_Comp comp=new RSP_Comp();
		RSP_User user=new RSP_User();
		RSP_Judge judge=new RSP_Judge();
		
		while(true) {
			int sel=user.getUser();
			int com= comp.getComputer();
			if(sel==-1) {
				System.out.println("게임이 종료되었습니다.");
				judge.print();
				break;
			}
			judge.gamedicision(com, sel);
		}
	}

}
