package step02;

import java.util.Scanner;

/*
 * 날짜 : 2025.07.10
 * 이름 : 서현우
문제
연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.

입력
첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.

출력
첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
 */
public class Main03 {

	public static void main(String[] args) {
		int a;
		int b=0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a%4==0) {
			if(a%400==0) {
				b=1;
			}
			else if(a%100==0) {
				b=0;
			}
			else
				b=1;
		}
		System.out.println(b);
		sc.close();

	}

}
