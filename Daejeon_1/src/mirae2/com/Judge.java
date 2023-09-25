package mirae2.com;

public class Judge {
	
	int com;
	int person;
	
	public Judge() {}
	public Judge(int com, int person) {
		this.com=com;
		this.person=person;
	}
	
	public int docalc(int com,int person) {
		int res;
		if(com==(person%3)){
			 return res=0;}
		else if((com+1)%3==(person%3)){
			return res=1;}
		else{
			 return res=2;}
	}
	
	public void sent(int res) {//문장으로 결과를 알려주는
		if(res==0) {
			System.out.println("졌습니다.");
		}
		else if(res==1) {
			System.out.println("이겼습니다.");
		}
		else {
			System.out.println("비겼습니다.");
		}
		
	}
	
}
