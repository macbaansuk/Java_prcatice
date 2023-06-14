package practice.Exercise6;

 class E6_6 {
//     6-6] 두 점의 거리를 계산하는 getDistance()를 완성하시오.
//             [Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
         // 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
         static double getDistance(int x, int y, int x1, int y1) {
             double num = (x1 - x) + (y1 - y);
             return  Math.sqrt(num);  // 결과과 NaN이 나온다
         }
         public static void main(String args[]) {
             System.out.println(getDistance(1,1,2,2));
         }

     }
