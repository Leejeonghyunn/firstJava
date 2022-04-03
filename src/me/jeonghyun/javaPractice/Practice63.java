package me.jeonghyun.javaPractice;

public class Practice63 {

	public static void main(String[] args) {
		Student2 s = new Student2();
		Student2 s1 = new Student2("홍길동",1,1,100,60,76);
	    s.name = "홍길동";
	    s.ban = 1;
	    s.no = 1;
	    s.kor = 100;
	    s.eng = 60;
	    s.math = 76;
	    String str = s1.info();
	    System.out.println(str);
	    System.out.println("이름 :"+s.name);
	    System.out.println("총점 :"+s.getTotal());
	    System.out.println("평균 :"+s.getAverage());	    
	}
}
 class Student2{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	Student2(){}  //기본생성자 
	Student2(String name,int ban, int no, int kor, int eng,int math){  //학생의 정보를 매개변수로 받는 생성자 
		 this.name=name;
		 this.ban=ban;
		 this.no=no;
		 this.kor=kor;
		 this.eng=eng;
		 this.math=math;
	}
	int getTotal() {  //총점을 구하는 메서드  
		return kor+eng+math;
	}
	float getAverage() {  //평균을 구하는 메서
		return (int)(getTotal()/3f*10+0.5f)/10f;
	}
	public String info() {   //학생의 정보를 추가하는 info()메서드 
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
