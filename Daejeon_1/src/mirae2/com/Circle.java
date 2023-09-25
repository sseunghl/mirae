package mirae2.com;

public class Circle {
	Point po;//클래스 안에 클래스가 들어옴-Composition
	private double radius;//반지름
	private double perimeters;//2*Math.pi*radius
	private double area;//Math.pi*radius^2
	
	
	public Circle() {}
	public Circle(Point po, double radius) {
		this.po=po;
		this.radius=radius;
	}
	public void calcPerimeter() {
		perimeters=2*Math.PI*radius;
		
	}
	public void calcArea() {
		area=Math.PI*radius*radius;
	}
	public void setPoint(Point po) {
		this.po=po;
	}
	public Point getPoint() {
		return po;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void print() {
		po.print();
		System.out.println("반지름은"+radius);
	}
	public boolean collision(Circle cl) {//포인트 사이의 거리가 두 원의 반지름을 더한값보다 작으면 충돌 
		double tot_radius= this.radius+cl.radius;
		double dist=po.distance2(cl.po);
		if(dist<tot_radius) return true;
		else return false;// 충돌하지 않음
	}
	
	
}
