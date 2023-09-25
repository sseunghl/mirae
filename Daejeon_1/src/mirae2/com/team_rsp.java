package mirae2.com;

public class team_rsp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Com co=new Com();
		User us=new User();
		Judge ju=new Judge();
		int useres=0;
		int comres=0;
		int jures=0;
		int win=0;
		int lose=0;
		int draw=0;
		int count=0;
		while(true) {
			us.print();
			count++;
			useres=us.RandUser();
		    if(useres==9) {
		    	System.out.println("종료되었습니다.");
		    	break;
		    	
		    }
			comres=co.RandCom();
			jures=ju.docalc(comres, useres);
			co.print(comres);
			ju.sent(jures);
		
			switch(comres) {
			case 0: win+=1; break;
			case 1: lose+=1; break;
			case 2: draw+=1; break;
		}
			System.out.println("----- 게임결과:"+ count+"전"+win+"승"+draw+"비김"+lose+"패.-----\n");
		
	}

}
}