package practice.Exercise4;

class E4_6 {
    public static void main(String[] args) {
        // 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
        // (1~6)+(1~6) = 6;
        // 1부터 6까지 랜덤으로 출력하고 (2번)
        int A = (int) (Math.random() * 6) + 1;
        int B = (int) (Math.random() * 6) + 1;
        System.out.println("A: " + A);
        System.out.println("B: " + B);




        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                if(i + j == 6){
                    System.out.println("a = "+ i + "b = "+ j);
                }
            }
        }

        //A와 B의 합이 6인 경우의 수
        // A + B == 6;
        if (A + B == 6) {
            System.out.println("A =" + A + " B=" + B);
        }
    }


}
