package mirae.com;

public class a_04_if {

	public static void main(String[] args) {
		boolean c = true;
		c = !c;
		System.out.println(c);
		c = !c;
		System.out.println(c);
		
		int a = 10;
		int b = 10;
		b = 5;
		int d = 20;
		System.out.println(a < b && a < d);
		System.out.println(a < b & a < d);
		System.out.println(a < b || a < d);
		
		int number = -13;
		if (number > 0) {
			System.out.println("긍정(POSITIVE");
		} else if (number < 0) {
			System.out.println("부정 (NEGATIVE)");
		} else {
			System.out.println("ZERO");
		}
		
		int day = 4;
		switch (day) {
		  case 1:	System.out.println("Monday"); break;
		  case 2:	System.out.println("Tuesday"); break;
		  case 3:	System.out.println("Wednesday"); break;
		  case 4:	System.out.println("Thursday"); break;
		  case 5:	System.out.println("Friday"); break;
		  case 6:	System.out.println("Saturday"); break;
		  case 7:	System.out.println("Sunday"); break;
		  
		}
		
	}

}
