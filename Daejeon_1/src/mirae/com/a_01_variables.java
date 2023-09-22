package mirae.com;

public class a_01_variables {

	public static void main(String[] args) {
		System.out.println("대한민국 만세");
		String str ="대전시";
		System.out.println(str + "에 살아요");
		
		int korea =90;
		korea = 75;
		int english = 76;
		int math = 76;
		
		int result = korea * english * math - 10 ;
		float average = result / 3.0f;
		System.out.println("평균은" + average);
		
		System.out.println("평균은" + Math.round(average));
		
		System.out.println(String.format("%.2f", average));
		
		final float pi = 3.141592f;
		System.out.println(pi);
		
		float shortPi = Math.round(pi*1000 ) / 1000f;
		System.out.println(shortPi);
		
	}

}
