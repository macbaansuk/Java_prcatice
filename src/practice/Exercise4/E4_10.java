package practice.Exercise4;

 class E4_10 {
//     int타입의 변수 num 있을 때, 각자리의 합을 더한 결과를 출력하는 코드를 완성하라.만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’
//     의 결과인 15를 출력하라.(1)에 알맞은코드를 넣으시오.
//     [주의]문자열로 변환하지 말고 숫자로만처리해야 한다.
         public static void main(String[] args) {
             int num = 12345;
             int sum = 0;
//             System.out.println(12345 % 1234);
//             System.out.println(1234 % 123);
//             System.out.println(123 % 12);
//             System.out.println(12 % 1);
//             System.out.println("sum=" + sum);

//             while(num!=0){
//                sum += num % 10;
//                 System.out.println("sum" + sum + ", num" + num);
//                num /= 10;
//             }


             for(int i=1; ; i++){
                 sum += num % 10;
                 num /= 10;
                 System.out.println("num = " +num);
                 if(num<=0){
                    break;
                 }
             }
                 System.out.println("sum = " + sum);
             //

         }
     }

