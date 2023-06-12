package practice.Exercise5;

import java.util.Scanner;

class E5_13 {
     public static void main(String[] args) {
//         [5-13] 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다. 실행결과와
//         같이 동작하도록 예제의 빈 곳을 채우시오.

                 String[] words = { "television", "computer", "mouse", "phone" };
                 Scanner scanner = new Scanner(System.in);
                 for(int i=0;i<words.length;i++) {
                     char[] question = words[i].toCharArray(); // String을 char[]로 변환
                        /*
                        (1) 알맞은 코드를 넣어 완성하시오.
                        char배열 question에 담긴 문자의 위치를 임의로 바꾼다.
                        */
                     System.out.printf("Q%d. %s의 뜻은?",i+1,words[i]);
                     String answer = scanner.nextLine();
                        // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
                     if(words[i].equals(answer.trim()))
                         System.out.printf("맞았습니다.%n%n");
                     else
                         System.out.printf("틀렸습니다.%n%n");
                 }
     } // main의 끝
}
//[실행결과]
//         Q1. chair의 뜻은? dmlwk
//         틀렸습니다. 정답은 의자입니다
//         Q2. computer의 뜻은? 컴퓨터
//         정답입니다.
//         Q3. integer의 뜻은? 정수
//         정답입니다.
//         전체 3문제 중 2문제 맞추셨습니다.