package practice.Exercise3;

//    [3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
//    값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.
    class Exercise3_5 {
        public static void main(String[] args) {
            int num = 333;
            System.out.println( num / 100 * 100 + (num - ((num / 100) * 100))  );
            System.out.println( num / 100 * 100  );
            System.out.println( (num - ((num / 100) * 100)) -num % 10 + 1 );
            //330을 만들어서 1을 더한다
            //300 + 30 + 3  330 - 300  = 30
            //770을 만들어서 1을 더한다
            System.out.println(  num / 100 * 100 + ((num - (num / 100 * 100)) ) /10 * 10  + 1);
            //num / 100 * 100 = 300
            // num - (num / 100 * 100) = 33

            System.out.println( num /10 * 10  + 1); //33 * 100 + 1

        }
    }

