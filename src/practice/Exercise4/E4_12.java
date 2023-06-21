package practice.Exercise4;

 class E4_12 {
     public static void main(String[] args) {
//         [4-12] 구구단의 일부분을 다음과 같이 출력하시오.
//         for(int i=2; i<=9; i++){
//             for(int j=1; j<j+1; j++){
//                 System.out.println("j= " + j);
//                 if(j==3)
//                     break;
//                 System.out.printf("%d*%d=%d%n",i, j,i*j);
//             }
////             System.out.println();
//         }
//         for(int i=2; i<3; i++){
//             for(int j=1; j<j+1; j++){
//                 System.out.println("j= " + j);
//                 System.out.printf("%d*%d=%d%n",i, j,i*j);
//                 if(j==3)
//                     break;
//             }
//             System.out.println();
//         }
         for (int i = 1; i <= 9; i++) {
             for (int j = 1; j <= 3; j++) {
                 int x = j + 1 + (i - 1) / 3 * 3;
                 int y = i % 3 == 0 ? 3 : i % 3;
                 if (x > 9) // 9단까지만 출력한다. 이 코드가 없으면 10단까지 출력된다.
                     break;
                 System.out.print(x + "*" + y + "=" + x * y + "\t"); //println이 아님에 주의
             }
             System.out.println();
             if (i % 3 == 0) System.out.println(); //
         }
     } // end of
 }





//[실행결과]
//         2*1=2 3*1=3 4*1=4
//         2*2=4 3*2=6 4*2=8
//         2*3=6 3*3=9 4*3=12
//         5*1=5 6*1=6 7*1=7
//         5*2=10 6*2=12 7*2=14
//         5*3=15 6*3=18 7*3=21
//         8*1=8 9*1=9
//         8*2=16 9*2=18
//         8*3=24 9*3=27
