package practice.Exercise5;

//[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
class E5_4 {
    public static void main(String[] args){
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0; //총합
        float average = 0; //평균

        //평균 = 총합 / 배열의 길이

        for(int i =0; i < arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                total += arr[i][j];
            }
//                average = (float)total / arr[i].length;  //이렇게 작성하면 65.0이나옴
        }
        average = total /(float)(arr.length * arr[0].length);
        System.out.println("total="+total);
        System.out.println("average="+average);

    } // end of main
} // end of class


