package mirae.com;

public class a_10_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int i=1; i<=10;i++) { System.out.println(i); } ctrl+shift+/이거 누르면 한번에 주석처리
		 */
		/*
		 * for(int i=0;i<=10;i++) { if(i==5) { break; } System.out.println(i); }
		 */
		//배열: 행 중심
		// 인덱스를 사용하는 방법: 1) 배열의 인덱스 2) 반복 횟수 3) 값으로 사용
		int bab = 0;
		int [][] data= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<=3;j++) {
				//{1,2}인 데이터만 처리에서 제외시키시오.
				if(i==0&&j==2) {
					break;
				}
				System.out.println(data[i][j]);
			}
		}
		int i=1;//초기가뵤
		while(i<=10) {//한계값: TRUE
			System.out.println(i);
			i++;//증감값
			
		}
		
		int j =1;
		do {//반드시 한번은 실행한다
			System.out.println(i);
			i++;
		}while(i<=10);
	}

}
