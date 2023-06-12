package practice.Exercise5;

//[5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열
//        의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. (1)
//        에 알맞은 코드를 넣어서 완성하시오.
class E5_11
{
    public static void main(String[] args)
    {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        int[][] result = new int[score.length+1][score[0].length+1];
        for(int i=0; i < score.length;i++) {
            System.out.println("i=" + i);
            for(int j=0; j < score[i].length;j++) {
//                result[5][0] += score[i][0];
//                result[5][1] += score[i][1];
//                result[5][2] += score[i][2];
                result[i][j] = score[i][j];
                result[i][3] += score[i][j];
                result[5][0] = score[0][0]+score[1][0]+score[2][0]+score[3][0]+score[4][0];
                System.out.println("j=" + j);
                result[5][1] = score[0][1]+score[1][1]+score[2][1]+score[3][1]+score[4][1];
                result[5][2] = score[0][2]+score[1][2]+score[2][2]+score[3][2]+score[4][2];
                result[5][3] += score[i][j];  //720
          }
        }
        for(int i=0; i < result.length;i++) {
            for(int j=0; j < result[i].length;j++) {
                System.out.printf("%4d",result[i][j]);
            }
            System.out.println();
        }
    } // main
}
