package mirae2.com;

public class Point {
	public double x;
	public double y;
	public Point() {};//매개변수가 있는 생성자를 만들면 (배열을 선언할때는) 디폴트 생성자가 반드시 필요하다->디폴트 
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getX() {
		return x;
	}
	public void setY() {
		this.y = y;
	}
	public double getY() {
		return y;
	}
	public double distance() {//포인트의 원점으로 부터의 거리값이 나온다
		return Math.sqrt(x*x+y*y);//루트를 Math.sqrt로 
	}
	public double distance2(Point po) {
		double dx=this.x-po.x;
		double dy=this.y-po.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	public double theta() {//원점으로 부터 그은 직선이 X축 기준으로 몇도인지 알려주는 함수
		double radian_result=Math.atan2(x, y);
		return Math.toDegrees(radian_result);
		
		//길이의 비를 주면 라디안을 알려주고 라디안을 각도로 변환
		//컴퓨터는 라디안을 입력해줘야 함
	}
	public void print() {
		System.out.println("x="+x+"  "+"y="+y);
	}
	public void printx() {
		System.out.println("x="+x);
	}
	public void printy() {
		System.out.println("y="+y);
	}
}
