package practice.Exercise6;

//     [6-7] 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서
//     드로 정의하시오.
     class MyPoint {
         int x;
         int y;
         MyPoint(int x, int y) {
             this.x = x;
             this.y = y;
         }

         double getDistance(int x1, int y1){
             MyPoint p = new MyPoint(x, y);
             int num = (x1 -x) + (y1 -y);
            return Math.sqrt(num) ;
         }
     }
     class E6_7 {
         public static void main(String args[]) {
             MyPoint p = new MyPoint(1,1);
            // p와 (2,2)의 거리를 구한다.
             System.out.println(p.getDistance(2,2));
         }
     }
