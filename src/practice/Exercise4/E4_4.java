package practice.Exercise4;

 class E4_4 {
     public static void main(String[] args) {
//         [4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
//         100이상이 되는지 구하시오.

         int sum = 0;
         int j = 1; //부호 바꾸는 변수
         int num = 0;

        for(int i =1; ;i++,j=-j){
            System.out.println("j= " + j);
            sum += i * j;
            System.out.println("i= " + i);
            if(sum == 100)
                break;
            System.out.println("sum =" + sum);
        }

     }
}
