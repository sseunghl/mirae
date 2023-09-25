package mirae2.com;

public class RSP_Comp {

	private int answer;
	public RSP_Comp() {}
    RSP_Comp(int answer){
    	this.answer=answer;
    }
    
    public int getComputer() {
    	answer=(int)(Math.random()*100%3);
    	return answer;
    }
}
