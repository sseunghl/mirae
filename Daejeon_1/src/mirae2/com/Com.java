package mirae2.com;

public class Com {
	int com;
	public Com() {};
	public int RandCom() {
		com=(int)(Math.random()*100)%3;
		return com;
	}
	public void Setcom() {
		this.com=com;
	}
	public void print(int com) {
		System.out.println("컴퓨터가 낸 것은 "+com+"입니다.");
	}
	
}
