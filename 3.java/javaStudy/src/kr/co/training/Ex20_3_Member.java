package kr.co.training;

public class Ex20_3_Member {
	
//	2. Ex20_3_Member
//	  - introduce 메서드
//	    > Ex20_3_MemberInfo를 매개변수로 받습니다.
//	    > "이름 : "
//	    > "나이 : "
//	    > "사는곳 : "
//	    > "학생여부 : "    (true면 학생, false 학생 아님)
		public void introduce(Ex20_3_MemberInfo memberinfo) {
			String strStudent;
			
			if (memberinfo.getIsStudent()) {
				strStudent = "학생";  // 삼항연자 = strStudent = memberinfo.getIsStudent() ? "학생":"학생 아님";
			} else {
				strStudent = "학생아님";
			}
			System.out.println("이름 : " + memberinfo.getName());
			System.out.println("나이 : " + memberinfo.getAge());
			System.out.println("사는곳 : " + memberinfo.getAddr());
			System.out.println("학생여부 : " + strStudent);
		}
//		 - run 메서드
//	    > Ex20_3_MemberInfo를 매개변수로 받습니다.
//	    > "OOO에 사는 OO가(이) 달리고 있습니다." 출력
		public void run(Ex20_3_MemberInfo memberinfo) {
			System.out.println(memberinfo.getAddr() + "에 사는 " + memberinfo.getName() + "가(이) 달리고 있습니다.");
		}
		
	

}
