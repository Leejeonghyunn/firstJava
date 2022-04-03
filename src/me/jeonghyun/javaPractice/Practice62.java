package me.jeonghyun.javaPractice;

public class Practice62 {

	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76);
		
		String str= s.info();
		System.out.println(str);
	}
}		
			
 class Student{
			String name;   
			int ban;
			int no;
			int kor;
			int eng;
			int math;
			
			Student (String name, int ban, int no, int kor, int eng, int math){
				this.name = name;  //학생의 이름,반,번호,과목별 성적을 매개변수로 받는 생성자 
				this.ban = ban;
				this.no = no;
				this.kor=kor;
				this.eng=eng;
				this.math= math;
			}
			public String info() {   //학생의 정보를 추가하는 info()메서
				return name
						+","+ban
						+","+no
						+","+kor
						+","+eng
						+","+math
						+","+(kor+eng+math)
						+","+((int)((kor+eng+math)/3f*10+0.5f)/10f)
                        ;
			}
			
		}


