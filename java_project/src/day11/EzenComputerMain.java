package day11;



public class EzenComputerMain {

	public static void main(String[] args) {
		//EzenComputer의 객체 생성 후 출력
		

		System.out.println(EzenComputer.company);
		
		EzenComputer ez = new EzenComputer("홍길동", "010-1111-1111", "인천");
		ez.printInfo();
		ez.printCompany();
		ez.insertCourse("java", "8/16~3/14");
		ez.insertCourse("DB", "1개월");
		ez.printCourse();
		System.out.println("---------------");
		EzenComputer ez1 = new EzenComputer("김영이", "990101", 24, "1111", "서울");
		ez1.printInfo();
		ez1.insertCourse("java", "8/16~3/14");
		ez1.insertCourse("html", "2개월");
		ez1.printCourse();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		/* 학생클래스를 담을수 있는 배열을 생성 후 
		 * 5명의 학생을 등록
		 * 
		 * */
		EzenComputer[] student = new EzenComputer[7];
		student[0]= new EzenComputer("영이", "980101", 25, "2222", "인천");
		student[1]= new EzenComputer("순이", "980201", 25, "3333", "서울");
		student[2]= new EzenComputer("철이", "980301", 25, "4444", "인천");
		student[3]= new EzenComputer("철수", "980401", 25, "5555", "서울");
		student[4]= new EzenComputer("영철", "980501", 25, "6666", "서울");
		student[5] = ez;
		student[6] = ez1;
		student[0].insertCourse("DB", "1개월");
		student[1].insertCourse("html", "2개월");
		student[1].insertCourse("java", "6개월");
		
		/* 학생 이름으로 검색 => 모든정보 출력
		 * 지점 정보로 검색 => 학생정보만 출력
		 * 과목을 수강하는 학생만 검색 => 학생정보, 수강정보 출력
		 * */
		int cnt=0;
		String searchName = "영이";
		System.out.println(searchName+" 님의 정보--------");
		for(int i=0; i<student.length; i++) {
			if(student[i].getName().equals(searchName)) {
				student[i].printInfo();
				student[i].printCompany();
				student[i].printCourse();
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("검색 결과가 없습니다.");
		}
		System.out.println("-----------------------------");
		String searchBranch="인천";
		System.out.println(searchBranch+"지점의 학생정보 출력-------");
		//향상된 for문은 완성된 배열에서만 사용가능 set은 불가능
		for(EzenComputer e : student) {
			if(e.getBranch().equals(searchBranch)) {
				e.printInfo();
			}
		}
		System.out.println("-----------------------------");
		String searchCourse="html";
		System.out.println(searchCourse+"과목의 학생정보 출력-------");
		for(EzenComputer e : student) {
			for(int i=0; i<e.getCnt(); i++) {
				if(searchCourse.equals(e.getCourse()[i])) { 
					e.printInfo();
					e.printCourse();
					System.out.println("--------------------");
				}
			}
		}
		
	}

}
