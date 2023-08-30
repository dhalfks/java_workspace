package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 1~50사이의 랜덤수를 생성하여 맞추는 게임
		 * ex) 컴퓨터가 랜덤 수 생성 : 35
		 * 입력> 10
		 * up~!!
		 * 입력> 20
		 * up~!!
		 * 입력> 40
		 * down~!!
		 * 입력> 35
		 * 정답~!! 
		 * */
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*50)+1;  //1~50까지의 랜덤수 
		
		System.out.println("1~50사이의 정수를 입력해주세요.");
		System.out.println("기회는 5번~!!");
		int num=0;
		for(int i=1;i<=5 ;i++ ) {
			System.out.println("입력>");
			num = scan.nextInt();
			if(num == random) {
				System.out.println("정답입니다.~!! ");
				break;
			}else if(num < random) {
				System.out.println("Up~!!" +i+ "번 실행");
				
			}else {
				System.out.println("Down~!!"+i+ "번 실행");
			}
		}
		System.out.println("기회가 모두 끝났습니다.~!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		

	}

}
