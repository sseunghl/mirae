package mirae2.com;

public class c_03_PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point po = new Point(1,1);
		po.print();
		
		System.out.println(po.distance());
		Point po2= new Point(2,2);
		System.out.println(po.distance2(po2));
		System.out.println(po2.distance());
		
		System.out.println(po.theta());
		System.out.println(po2.theta());
	}

}
