package practice.Exercise4;

 class E4_4 {
     public static void main(String[] args) {
//         [4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
//         100이상이 되는지 구하시오.

         int sum = 0;
         int num = 0;
         int s = 1;
//         for(int i =1;true; i+=2){
//            System.out.println("i:" + i);
//            for(int j=1;true;j+=2){  //이렇게 하면 j는 조건식이 없이니 무한반목에 빠지므로 이중for문은 쓰면 안됨
//                System.out.println("j:" + j);
//                sum += i + j;
//                if(sum >= 100)
//                    break;
//            }
//        }

         for(int i=1;; i++, s=-s){
             num = i * s;
//             System.out.println("num:::" + num);
             sum += num;

             if(sum>=100)
                 break;
         }


         System.out.println("num=" + num);
         System.out.println("sum=" + sum);


     }

 }
