package day04;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 나자신의 수만 가지는 수를 소수
		 * 소수 : 3, 5, 7, 11, 13, 17.. 
		 * */
		
		/* num를 입력받아서 num가 소수인지 아닌지 판별
		 * ex) num = 13 => 소수입니다.
		 *     num = 12 => 소수가 아닙니다.
		 * */
		//입력받은 수의 약수가 몇개인지 확인
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//		int num = scan.nextInt(); //2~100
//		int count=0;
//		for(int i=1; i<=num; i++) {
//			if( num % i == 0) {
//				//System.out.print(i+" ");
//				//약수의 개수
//				count = count+1;  // count++;
//			}
//		}
//		System.out.println(count);
//		
//		if(count == 2) {
//			System.out.println("소수입니다.");
//		}else {
//			System.out.println("소수가 아닙니다.");
//		}
//		scan.close();
		
		/* 2~100까지 중 소수를 출력   ==  int i*/
		/* 약수 값은 1부터 ~ i까지 돌려서 약수를 구해야 함 */
		
		int count = 0;
		for(int i=2; i<=100; i++) {  // num 2~100까지
			count = 0;  //각 num마다 약수의 개수 = 0부터 시작
			for(int j=1; j<=i; j++) { //약수를 구하기 위해 돌리는 값
				if(i % j == 0) {  //약수
					count++;
				}
			}
			//약수가 2개인지 체크
			if(count == 2) {
				System.out.print(i+" ");
			}
		}
		
		
		
		

	}

}
