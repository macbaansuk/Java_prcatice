package practice.Exercise4;

//for문을 while문으로 변경하시오.
 class E4_5 {
     public static void main(String[] args) {
//         for(int i =0; i <= 10; i++){
//             for(int j=0; j<=i; j++)
//                 System.out.println("*");
//             System.out.println();
//         }

         //while
         int i = 0; //초기화
         while(i <= 10) { //조건식
             i++;
             int j = 0;
             while(j<i) {
                 System.out.println("*");
//                 System.out.println("j"+j);
                 j++;
             }
         System.out.println();
         }


     }
}
