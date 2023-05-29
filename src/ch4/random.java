package ch4;

 class random {
    public static void main(String args[]){
        int num = 0;

        //괄호{} 안의 내용을 20번 반복한다.
        // Quiz. 1~10 사이의 난수를 20개 출력하시오.
        // Quiz2. -5~5 사이의 난수를 20개 출력하시오.
//        for(int i=1; i <=20; i++){
//            System.out.println((int)(Math.random()*10) +1);
//        }

        //Quiz2
        //-5,-4,-3,-2,-1,0,1,2,3,4,5 = 11개
        for(int i=2; i<=20; i++){
            System.out.println((int)(Math.random()*11)-5);
        }


    }
}
