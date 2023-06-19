package practice.Exercise6;
//[6-23] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
//        메서드명 : max
//        기 능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
//        만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
//        반환타입 : int
//        매개변수 : int[] arr - 최대값을 구할 배열
 class E6_23 {

     static int max(int[] arr) {

        if(arr == null ||  arr.length ==0 ) // arr.length ==0 ||arr == null 순서바꾸면 안됨 -> null일 경우 arr.length가 먼저 평가되기때문
            return -999999;
//        else if(arr.length == 0)
//            return -999999;


        int max = arr[0];
         for (int i = 1; i < arr.length; i++) {  //for문이 순회하지 않는다 왜지? //if문이 안돌아감  -> 순회가 안됨  --> return문을 for문안에 넣었기 때문에!
             if (arr[i] > max) {
//                 System.out.println("i=" + i);
                 max = arr[i];  // 거꾸로 하면 max의 값이 바뀌지 않는다 arr[i] = max;
//                 System.out.println("arr[i]" + arr[i]);
             }

         }
        return max;
     }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
    }
}
