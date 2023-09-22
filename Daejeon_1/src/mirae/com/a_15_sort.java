package mirae.com;

public class a_15_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number = new int [10];//0~9
		for(int i=0;i<number.length;i++) {
			number[i]=i;
			System.out.println(number[i]+" ");
		}
		System.out.println("\n");
		//데이터 섞기
		for(int i=0;i<100;i++) {
			int n=(int)(Math.random()*10);
			int temp=number[0];
			number[0]=number[n];
			number[n]=temp;
		}
		
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}
		System.out.println("\n");
		//버블 정렬
		
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number.length-i-1;j++) {//-1은 마지막 칸 앞까지 계산하라는 소리,-i는 마지막 칸엔 이미 정렬된 값이 들어가기 때문
				if(number[j]>number[j+1]) {
					int temp= number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}
		}
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}
		System.out.println("\n");
		
		for(int i=0;i<number.length;i++) {
			boolean changed=false;
			for(int j=0;j<number.length-i-1;j++) {
				if(number[j]>number[j+1]) {
					int temp= number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
					changed=true;
				}
			}
			if(!changed)break;//변경하지 않았으면 종료
		}
		
	}

}
