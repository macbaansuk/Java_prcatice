package practice.Exercise3;


//[3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =
//        5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점
//        셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)
class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = 0 ;
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);

        System.out.println( (int)((5/9f  * (fahrenheit - 32)) * 100)/ 100.0  );
        System.out.println( (int)((5/9f  * (fahrenheit - 32)) * 100 + 0.5) / 100.0  );
        // 37.78
        //1. 값에 100을 곱한다
        System.out.println( 5/9f  * (fahrenheit - 32) * 100   );
        //2. 1의 결과에 0.5를 더한다
        System.out.println( 5/9f  * (fahrenheit - 32) * 100 + 0.5   );
        //3. 2의 결과를 int타입으로 변환한다.
        System.out.println( (int)(5/9f  * (fahrenheit - 32) * 100 + 0.5)   );
        //4. 3의 결과를 100f로 나눈다(100으로 나누면 소수점 아래의 값을 잃는다)
        System.out.println( (int)(5/9f  * (fahrenheit - 32) * 100 + 0.5) / 100.0  );




    }
}
