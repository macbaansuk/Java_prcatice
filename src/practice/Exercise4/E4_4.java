package practice.Exercise4;

 class E4_4 {
     public static void main(String[] args) {
//         [4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
//         100이상이 되는지 구하시오.

         int sum = 0;
         int i =0;

         while(sum<=100){
             sum = i + (-(i+1));
             System.out.println("i = " + i);
             System.out.println("sum = " + sum);
             i++;
         }

         }

}
