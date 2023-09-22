package mirae.com;

import java.util.Scanner;

public class a_05_if_test {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("월을 입력하시오");
		int month = input.nextInt();
		String season = null;
		
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		}else if (month == 3 || month == 4 || month == 5 ) {
			season = "봄";
		}else if (month == 6 || month == 7 || month == 8 ) {
			season = "여름";
		}else if (month == 9 || month == 10 || month == 11 ) {
			season = "가을";
		}else {
			season = "없는 계절";
		}
		System.out.println(month + "월은" + season + "입니다.");
		
	}

}
