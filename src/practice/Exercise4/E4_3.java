package practice.Exercise4;

//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오
 class E4_3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i<=10; i++){
            //1씩 증가하면서 계속 더하기
             sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
