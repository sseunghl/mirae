package mirae.com;

public class a_14_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//방법1
		int arr[]= {2,11,45,9};//중괄호는 블록 묶음 처리
		for(int num:arr) {// 전체적으로 데이터 처리해야할때 확장for문
			System.out.println(num);
		}
		//방법2
		int[]a =new int[4];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			int temp=a[i];
			sum+=temp;
			System.out.println(temp);
		}
		System.out.printf("배열의 총합은 %d입니다.\n",sum);
		
		int[] score = {79,88,91,33,100,55,95};
		int max=score[0];
		int min=score[0];
		for(int i=1;i<score.length;i++) {
			if(score[i]>max) {
				max=score[i];
			}
			if(score[i]<min) {
				min=score[i];
			}
		}
		System.out.println("최댓값:"+max);
		System.out.println("최솟갑:"+min);
		}

}
