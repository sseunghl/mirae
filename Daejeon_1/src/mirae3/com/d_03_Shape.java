package mirae3.com;

class Shape{
	public double area;
	public void display() {
		System.out.println("면적은"+this.area+"입니다.");
	}
	public void calcArea() {}
}

class Circle extends Shape{
	public double radius;
	public Circle(double radius) {
		this.radius=radius;
		calcArea();
	}
	public double getRadius( ) {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
		calcArea();
	}
	public void calcArea() {
		area=Math.PI*radius*radius;
	}
}
//문제 Rectangle class를 작성하시오 Circle을 기준으로 작성
//width,height

class Rectangle extends Shape{
	public double width;//높이
	public double height;//

	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	
	public void setHeight(double height) {
		this.height=height;
		calcArea();
	}
	public double getHeight() {
	
		return height;
	
	}
	public void setWidth(double width) {
		this.width=width;
		calcArea();
	}
	public void calcArea() {
		area=height*width;
	}
}

class Triangle extends Shape{//Pa
	public double height;
	public double width;
	public Triangle(double height, double width) {
		this.height=height;
		this.width=width;
	}
	public void setHeight(double height) {
		this.height=height;
		calcArea();
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		this.width=width;
		calcArea();
	}
	public double getWidth() {
		return width;
	}
	public void calcArea() {
		area=width*height/2;
	}
}

//부모는 자식을 가리킬 수 잇음
public class d_03_Shape {
	public static void sharePrint(Shape sh) {//부모를 매개변수로 하는 경우
		if(sh instanceof Circle) {//true/false 리턴
			Circle c1=(Circle)sh;//다운캐스팅
			c1.setRadius(100);
			c1.calcArea();
			c1.display();
			
		}
		else if(sh instanceof Rectangle) {
			Rectangle re=(Rectangle) sh;
			re.setHeight(100);
			re.setWidth(200);
			re.calcArea();
			re.display();
		}
		else if(sh instanceof Triangle) {
			Triangle tr=(Triangle) sh;
			tr.setHeight(50);
			tr.setWidth(50);
			tr.calcArea();
			tr.display();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(10);
		c1.display();
		
		Shape sh = new Circle(20);
		sh.display();
		//sh로 부터 반지름을 출력하시오.
		Circle cc1=(Circle) sh;//다운캐스팅
		System.out.println("원의 반지름은"+cc1.getRadius());
		
		Rectangle re= new Rectangle(10,20);
		re.display();
		
		Triangle tr= new Triangle(10,5);
		tr.display();
		
		//부모의 배열에 위의 c1, re,tr을 입력하시오
		//부모 클래스 자식을 관리하는 것->이 방법 권장!!!!!
		Shape sh1[]=new Shape[3];
		sh1[0]=c1;
		sh1[1]=re;
		sh1[2]=tr;//부모배열로 자식들을 한번에 관리하는 것
		
		for(int i=0;i<3;i++) {
			sh1[i].display();
		}
		//디자인패턴의 기본 패턴
		sharePrint(c1);//부모로 매개변수를 지정, 실제 자식 클래스를 전달해서 작업->이 방법 권장@!!!!
		sharePrint(re);
		sharePrint(tr);
		
		for(int i=0;i<3;i++) {
			sharePrint(sh1[i]);
		}
	}

}
