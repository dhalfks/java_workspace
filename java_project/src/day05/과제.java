package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 파일명 5개가 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가
		 * 있는 파일들을 출력하도록 코드를 작성하시오.
		 * 
		 * 제출
		 * */
		String[] fileName = {"java의 정석.txt","이것이 java다.jpg"
				,"String메서드.txt", "String함수.jpg","java의 함수.png"};
		
		// contains(str) : str의 단어가 포함되어 있는지 체크 return true / false
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 단어 입력 : ");
		String s = scan.next();  //공백 없는 1단어를 입력
		int cnt = 0;
		System.out.println("--검색 값: "+s+"--");
		for(String tmp : fileName) {
			if(tmp.contains(s)) { //if의 조건식은 true/false
				// if((i % 2==0) == true){   
				System.out.println(tmp);
 				cnt++;
			}
		}
		if(cnt == 0) { //검색 결과가 없다면...
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("총 검색결과 "+cnt+"개 출력");			
		}
		
		scan.close();

	}

}
