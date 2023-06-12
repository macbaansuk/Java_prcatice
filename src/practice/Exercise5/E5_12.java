package practice.Exercise5;

import java.util.Scanner;

class E5_12 {
    public static void main(String[] args) {
//         [5-13] 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다. 실행결과와
//         같이 동작하도록 예제의 빈 곳을 채우시오.

        String[] words = {"chair", "computer", "integer"};
        String[] correct = {"의자", "컴퓨터", "정수"};
        Scanner scanner = new Scanner(System.in);
        int cnt = 0; //맞춘 횟수
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < correct.length; j++) {
                System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i]);
                String answer = scanner.nextLine();  //정답 입력
//            if(words[i].equals(correct[i].trim())) {
                if (words[i].equals(correct[j])) {
                    System.out.printf("정답입니다.%n%n");
                    cnt++;
                } else
                    System.out.printf("틀렸습니다. 정답은 %s입니다", correct[j]);

            }
            System.out.printf("전체 3문제 중 %d문제 맞추셨습니다.", cnt);
        } // main의 끝
    }
}

//[실행결과]
//         Q1. chair의 뜻은? dmlwk
//         틀렸습니다. 정답은 의자입니다
//         Q2. computer의 뜻은? 컴퓨터
//         정답입니다.
//         Q3. integer의 뜻은? 정수
//         정답입니다.
//         전체 3문제 중 2문제 맞추셨습니다.
