package mirae.com;

public class A_02_operator {

	public static void main(String[] args) {
		int i=5; //특수문자는 $,_만 가능
		i++;
		System.out.println(i);
		i=5;
		++i;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(++i);
		
		System.out.println("십의 상승" + Math.pow(10, 3));
		int j = 0;
		System.out.println(10>1);
		System.out.println( j ++ + 10); //단항연산자가 우선순위
		System.out.println( j );
		
		int number = 200;
		String s = String.valueOf(number); //number에 들어온 값을 valueof로 문자열로 변환 (형변환)
		System.out.println(i + 100);
		System.out.println(s + 100); 
		
		String si="200";
		int Pnumber=Integer.parseInt(si);
		System.out.println(si);
		System.out.println(Pnumber);
		
		byte iByte=10;
		short ishor=10;
		int iInt=10;
		long iLong=10;
		int tmp=iByte;
		byte tmp2=(byte)iInt;
		float num1 = 10.1f;
		double num2 = 10.1d;
		char ch1='a';
		String st ="대한민국";
		System.out.println(st);
			
			char c1 = 'a';
			 int j1 = c1 + 3 ;
			 System.out.println(j1);
			 char c3 = (char) (c1 + 1);
			 System.out.println(c3);
			 
			 System.out.println(Integer.toBinaryString(8));
			 int temp = 8 >> 2;
			 System.out.println(temp);
			 System.out.println(Integer.toBinaryString(temp));
			 
			 int x = 123;
			 int y = 205;
			 System.out.println(Integer.toBinaryString(x));
			 System.out.println(Integer.toBinaryString(y));
			 int z = x&y;
			 
			 
			 
			 
	}

}
