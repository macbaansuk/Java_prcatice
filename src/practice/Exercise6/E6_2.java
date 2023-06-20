package practice.Exercise6;

//[6-2] 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
//        결과와 같은 결과를 얻도록 하시오.
class E6_2 {
    public static void main(String args[]) {
        SutdaCard card1 = new SutdaCard(3, false); //false이면 k가 안붙고 true 이면 k가 붙는다
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
class SutdaCard {

    int num;
    boolean k;

    SutdaCard(){  //기본값이 true
        this(1,true);
    }
        SutdaCard(int num,boolean k){
            this.num = num;
            this.k = k;  //기본값이 1K  기본생성자에 값을 집어넣어줘야하나??
        }

        String info(){
            //SutdaCard()boolean k의 값이 false이면 k를 붙이지 않는다
            return num + (k? "K" : "");
        }

}
