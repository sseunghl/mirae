package mirae.com;

public class a_17_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]sungjuk= {{90,90,90,0},{89,89,89,0},{90,99,99,0}};
		//합계
		//평균
		/* int sum=0; */
		
		double [] avr= new double[3];
		
		/*
		 * for(int i=0;i<2;i++) { for(int j=0;j<3;j++) { sum+=sungjuk[i][j]; if(j==2) {
		 * sungjuk[i][3]=sum; avr[i]=sum/3; System.out.print(sungjuk[i][j]+" ");
		 * System.out.print(avr[i]); } } }
		 */
		String[] name= {"대한","민국","만세"};
		System.out.println("이름 국어 영어 수학 합계 평균");
		for(int i=0;i<sungjuk.length;i++) {
			int tot = 0;
			for(int j=0;j<sungjuk.length;j++) {
				tot+=sungjuk[i][j];
			}
			sungjuk[i][3]=tot;
			
			avr[i]= Math.round(tot/3*100)/100;
			//소수점 셋째자리까지 나타내고 둘째자리까지 표현하려고
			//97.123->9712.3 반올림 9712를 100으로 나누면 97.12
		}
		for(int i=0;i<sungjuk.length;i++) {
			System.out.print(name[i]+" ");
			for(int j=0;j<sungjuk.length;j++) {
				System.out.print(sungjuk[i][j]+"  ");
			}
			System.out.print(avr[i]);
			System.out.println();
		}
	}

}
