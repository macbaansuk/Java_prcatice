package practice.Exercise6;

import org.w3c.dom.ls.LSOutput;

//[6-4] 문제6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드
//        getTotal()과 getAverage()를 추가하시오.
//        1. 메서드명 : getTotal
//        기 능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
//        반환타입 : int
//        매개변수 : 없음
//        2. 메서드명 : getAverage
//        기 능 : 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다.
//        소수점 둘째자리에서 반올림할 것.
//        반환타입 : float
//        매개변수 : 없음
class E6_4 {
    public static void main(String args[]) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.getAverage());
    }
}
class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int getTotal(){
        return kor + eng + math;
    }


    float getAverage(){
        float avg = (float)getTotal() / 3;
//        return (float)((Math.round((float)getTotal()/3)*10)/10.0);  //왜 Math.round가 적용이 안될까  --> 변수에 저장하니깐 적용이됨 ㅎㅎ 왜일까
        return (float)(Math.round(avg*10)/10.0);

    }
}